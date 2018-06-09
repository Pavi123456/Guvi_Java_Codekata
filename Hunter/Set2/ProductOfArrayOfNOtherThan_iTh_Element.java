import java.util.Scanner;
public class ProductArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100000];
        int b[]=new int[100000];
        int p=1;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            p=1;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                else{
                    p=p*a[j]; 
                }
            }
            b[i]=p;
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
