import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int n,q,u,v,j,sum;
        sum=0;
        int a[]=new int[100000];
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        q=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            sum=0;
            u=sc.nextInt();
            u=u-1;
            v=sc.nextInt();
            for(j=u;j<v;j++){
              sum=sum+a[j];  
            }
            System.out.println(sum);
        }
    }
}
