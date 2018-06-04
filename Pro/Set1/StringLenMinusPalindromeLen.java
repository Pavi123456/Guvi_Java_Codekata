import java.util.Scanner;
public class MyClass {
    public String reverse(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+ str.charAt(i);
        }
        return rev;
    }
    public static void main(String args[]) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        //System.out.println("original string = "+s);
        MyClass m = new MyClass();
        int length=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String s1=s.substring(i,j+1);
                if(s1.equals(m.reverse(s1))){
                    if(length<=s1.length()){
                        length=s1.length();
                    }
                }
            }
        }
        System.out.println(s.length()-length);
    }
}
