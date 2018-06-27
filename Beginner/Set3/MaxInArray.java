import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int[] a = new int[100000];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ; i<n ;i++){
            a[i] = sc.nextInt();
        }
        int temp =0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]<=a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(a[1]);
    }
}
