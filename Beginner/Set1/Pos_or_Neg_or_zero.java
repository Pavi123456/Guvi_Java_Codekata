


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
        int n = sc.nextInt();
        result = n>0? "Positive" :n==0? "Zero" : "Negative";
        System.out.println(result);
    }
    
}
