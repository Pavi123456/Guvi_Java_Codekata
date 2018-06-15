import java.util.Scanner;
import java.lang.Math;
public class MyClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100000];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            //System.out.println(a[i]);
        }
        int v=2;
        int i;
        for(i=1;v<=n;i++){
            v=(int)Math.pow(2,i);   
        }
        System.out.println((int)Math.pow(2,i-2));
    }
}
