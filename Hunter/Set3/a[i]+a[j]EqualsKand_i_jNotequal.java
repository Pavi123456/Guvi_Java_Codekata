import java.util.Scanner;
public class ProductArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100000];
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int i,j;
        i=j=0;
        outerloop:
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                else if((a[i]+a[j])==k){
                    System.out.println("YES");
                    break outerloop;
                }
            }
        }
        if((i==n)&&(j==n)){
                System.out.println("NO");
        }
    }
}
