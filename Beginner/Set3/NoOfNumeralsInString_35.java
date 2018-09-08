import java.util.Scanner;
import java.util.*;

public class NoOfNumerals{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String s1 = new String("1234567890");
        String s = new String(sc.nextLine());
        for(int i=0;i<s.length();i++){
            if(s1.contains(String.valueOf((s.charAt(i)))))
                count++;
        }
        System.out.println(count);
    }
}
