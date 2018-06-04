import java.util.*;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s=sc.nextLine();
        String alpha = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        //System.out.println(s.toUpperCase());
        s=s.toUpperCase();
        s=s.replace(" ","");
        for(int i=0;i<(s.length());i++){
            String s3 = String.valueOf(s.charAt(i)); 
           alpha=alpha.replace(s3,"");
        }
        //System.out.println("Length post = "+alpha.length());
        if(alpha.length()==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
