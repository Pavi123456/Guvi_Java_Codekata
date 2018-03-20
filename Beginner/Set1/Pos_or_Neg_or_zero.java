
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sri Kumaran DR
 */
public class positiveOrNegOrZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String result="";
        int n=0;
        try{
            n = sc.nextInt();
            if(n>100000){
            throw new IndexOutOfBoundsException("out of range");
            }
        }
        catch(InputMismatchException e){
                System.out.println("Input mismatch enter only integers");
            System.exit(0);
        }
        catch (IndexOutOfBoundsException o){
            System.out.println("Out of range do not enter greater than 100000");
            System.exit(0);
        }
        
        result = n>0? "Positive" :n==0? "Zero" : "Negative";
        System.out.println(result);
        
    }
    
    
}
