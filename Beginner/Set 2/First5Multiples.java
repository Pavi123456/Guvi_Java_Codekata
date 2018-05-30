import java.util.Scanner;
public class MyClass {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        for(int i=1;i<6;i++){
            System.out.print(a*i+" ");
        }
    }
}
