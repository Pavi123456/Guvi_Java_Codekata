import java.util.Scanner;
import java.util.StringTokenizer;

public class NoOfSentences{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String(sc.nextLine());
        StringTokenizer st = new StringTokenizer(s,".");
        int count =0;
        while(st.hasMoreTokens()){
            st.nextToken();
            count++;
        }
        System.out.println(count);
    }
}
