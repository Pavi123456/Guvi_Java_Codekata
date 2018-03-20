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
            throw new IndexOutOfBoundsException("demo");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Input Mismatch enter only integers");
            System.exit(0);
        }
        catch (IndexOutOfBoundsException o){
            System.out.println("Enter a value less 100001");
            System.exit(0);
        }
        
        result = n>0? "Positive" :n==0? "Zero" : "Negative";
        System.out.println(result);
        
    }
    
    
}
