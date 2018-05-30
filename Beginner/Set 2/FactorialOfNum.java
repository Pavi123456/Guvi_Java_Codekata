import java.util.Scanner;
public class MyClass {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,sum=1;
        a = sc.nextInt();
        for(int i=1;i<=a;i++)
            sum=sum*i;
            System.out.print(sum);
    }
}
