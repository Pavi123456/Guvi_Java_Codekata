import java.util.Scanner;
public class ArrayIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            double a = sc.nextDouble();
            System.out.println("Yes");
        }
        catch(Exception e){
          System.out.println("No");   
        }
    }
}
