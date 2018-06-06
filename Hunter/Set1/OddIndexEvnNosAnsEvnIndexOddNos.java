import java.util.Scanner;
public class RepeatedNos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100000];
        int n =sc.nextInt();
        String s = new String("");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if((i%2==0)&&(a[i]%2==1)){
                //System.out.print(a[i]+" ");
                s=s+a[i]+" ";
            }
            else if((i%2==1)&&(a[i]%2==0)){
                //System.out.print(a[i]+" ");
                s=s+a[i]+" ";
            }
            //System.out.println(s+"--");
            if(i==n-1){
                s=s.substring(0,s.length()-1);
                System.out.println(s);
            }
        }
    }
}
