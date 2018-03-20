
import java.util.InputMismatchException;
import java.util.Scanner;
public class OddReven {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result="";
        double j=0;
       j = sc.nextDouble();
        if((j>0)&&(j>100000))
            System.out.println("Input mismatch enter oly integers and less than 1lakh and one 100001");
        else{
            result = j%2==0? "Even" : "Odd";
            System.out.println(result);
        }       
        
    }
    
}
