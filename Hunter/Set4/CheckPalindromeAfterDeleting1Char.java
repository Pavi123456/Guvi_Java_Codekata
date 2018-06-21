import java.util.Scanner;
public class string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String("");
        s=sc.next();
        s=s.toUpperCase();
        //System.out.println("Original String: "+s);
        int i=0;
        String s1,rev;
        rev = new String("");
        s1 = new String("");
        for(i=0;i<s.length();i++){
            //s1 = s.replace(String.valueOf(s.charAt(i)),"");
            if(i==0){
                s1 = s.substring(1,s.length());
            }
            else{
                s1 = s.substring(0,i)+s.substring(i+1,s.length());
            }
            for(int j=s1.length()-1;j>=0;j--){
                rev = rev + s1.charAt(j);   
                //System.out.println("Rev: "+rev);
            }
            if(s1.equals(rev)){
                System.out.println("YES");
                break;
            }
            rev = new String("");
        }
        if(i==s.length()){
            System.out.println("NO");
        }
    }
}
