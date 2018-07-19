import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int a[] = new int[100000];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i =0; i <n;i++){
            //a[i] = sc.nextInt();
            sum = sum + sc.nextInt(); 
        }
        System.out.println(sum);
    }
}
