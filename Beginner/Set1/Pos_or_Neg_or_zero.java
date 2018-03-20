
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sri Kumaran DR
 */
public class positiveOrNegOrZero {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String result="";
        int n=0;
        try{
            n = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Input Mismatch enter only integers");
            System.exit(0);
        }
        result = n>0? "Positive" :n==0? "Zero" : "Negative";
        System.out.println(result);
        
    }
