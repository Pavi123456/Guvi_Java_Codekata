import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int n,q,u,v,j,xor,temp;
        xor=0;
        int a[]=new int[100000];
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        q=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            xor=0;
            u=sc.nextInt();
            u=u-1;
            v=sc.nextInt();
            for(int k=u;k<v;k++){    
                xor=xor^a[k];
            }
            System.out.println(xor);
        }
    }
}
