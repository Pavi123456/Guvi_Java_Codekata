import java.util.Scanner;
import java.lang.Math;
public class MyClass {
    public static void main(String args[]) {
        int a[]=new int[100000];
        Scanner sc = new Scanner(System.in);
        String s = new String("");
        int sum=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            //System.out.print(a[i]);
        }
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        /*System.out.println(" ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }*/
        for(int i =0;i<n;i++){
            sum=(int)(sum+(a[i]*Math.pow(10,n-i-1)));
        }
        //System.out.println(" ");
        System.out.println(sum);    
        /*for(int i=n-1;i>=0;i--){
            sum = (int)(sum +a[i]*(Math.pow(10,i)));
            System.out.println(sum);
        }
        s=s+sum;
        /*for(int i=n-1;i>=0;i--){
            if(a[i]==0){
                s = s+a[i];
            }
        }
        System.out.println(s);*/
    }
}
