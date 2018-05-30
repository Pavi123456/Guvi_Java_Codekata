import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b,i=0;
        a = sc.nextInt();
        b = sc.nextInt();
        if((a<=100000)&&(b<=100000)){
            if(a%2!=0){
                i=a;
                while(i<=b){
                    System.out.print(i+" ");
                    i+=2;
                }
            }
            else{
                i=a+1;
                while(i<=b){
                    System.out.print(i+" ");
                    i+=2;
                }
            }
        }
        else{
            System.out.println("Enter no. within 100000 only");
        }
    }
}
