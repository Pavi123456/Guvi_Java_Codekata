
import java.util.InputMismatchException;
import java.util.Scanner;
public class OddReven {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result="";
        double j=0;
        try{
            j = sc.nextDouble();
            if(j>100000){
            throw new InputMismatchException ("out of the given range");
            }
        }
        catch(InputMismatchException e){
                System.out.println("Input mismatch enter oly integers and less than 1lakh and one 100001");
            System.exit(0);
        }        
        result = j%2==0? "Even" : "Odd";
        System.out.println(result);
        
    }
    
}
