import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int flag=0;
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100000];
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if((a[i]+a[j])==k){
                    //System.out.println("yes");
                    flag=1;
                }
            }
        }
        if(flag==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
