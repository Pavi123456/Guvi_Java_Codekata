package PrintNtimes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sri Kumaran DR
 */
public class PrintNtimes {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       if(sc.hasNextDouble()){
            double N = sc.nextDouble();
            if(N<0)
                System.out.println("Enter Positive Integer");
            else{
                for(int i=0;i<(int)N;i++)
                System.out.println("Hello");
            }        
        }
        else
           System.out.println("Invalid input");
           
    }
    
}
