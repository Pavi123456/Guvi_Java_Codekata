import java.util.Scanner;
import java.util.StringTokenizer;
public class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=new String("");
        String s1 = new String("");
        String r = new String("");
        String rev = new String("");
        s=sc.nextLine();
        System.out.println("Original String = "+s);
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            s1=String.valueOf(st.nextToken());
            //System.out.println("token = "+s1);
            for(int i =s1.length()-1;i>=0;i--){
                r = r+s1.charAt(i);    
               // System.out.println(r);
            }
            r=r +" ";
            //System.out.println(r);
        }
        System.out.println(r.substring(0,r.length()));
    }
}
