import java.util.Scanner;
//Corrected code 
public class StringRev{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String("");
        s= sc.next();
        for(int i = s.length()-1;i>=0;i--)
            System.out.print(s.charAt(i));
    }
}
//Corrected code 
