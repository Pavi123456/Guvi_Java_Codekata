import java.util.StringTokenizer;
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s =  new String("");
        s = sc.nextLine();
        int count=0;
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            st.nextToken();
            count++;
        }
        System.out.println(count-1);
    }
}
