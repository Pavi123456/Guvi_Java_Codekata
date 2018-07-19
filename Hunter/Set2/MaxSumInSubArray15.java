import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int a[] = new int[100000];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        
        for(int i =0; i<n;i++){
            a[i] = sc.nextInt();
            //sum = sum + a[i];
        }
        for(int i=0;i<n;i++){
            int sumt=0;    
            for(int j=i;j<n;j++){
                if(a[i]>=sum){
                    sum = a[i];
                }
                sumt = sumt+a[j];
                if(sumt>sum){
                    sum=sumt;
                }
            }//System.out.println(sum);
        }
       System.out.println(sum);
    }
}
