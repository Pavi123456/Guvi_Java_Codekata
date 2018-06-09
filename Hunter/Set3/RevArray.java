import java.util.Scanner;
public class ProductArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100000];
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]);
            if(i!=0){
                System.out.print("->");
            }
        }
    }
}
