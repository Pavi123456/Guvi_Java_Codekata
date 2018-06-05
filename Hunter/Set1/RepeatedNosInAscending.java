import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100000];
        int b[]=new int[100000];
        n=sc.nextInt()+1;
        int flag=0;
        String s= new String("");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>=a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            s=s+a[i];
            //System.out.println(s);
        }
        for(int i=0;i<s.length();i++){
            int pos =s.lastIndexOf(s.charAt(i));
            if(pos!=i){
                b[i]=a[i];
                System.out.print(b[i]+" ");
            }
        }
    }
}
