import java.util.Scanner;

public class MyClass {
/*    public void prime(int s){
    int sum = s;
    if((sum==0)||(sum==1)){
        System.out.println("NO");
    }
    else if(sum==2){
        System.out.println("YES");
    }
    else{
        int i=0;
        for(i = 2;i<sum;i++){
            if((sum%i)==0){
                System.out.println("NO");
                break;
            }
        }
        if(i==sum){
            System.out.println("YES");
        }
    }
}*/
    public static void main(String args[]) {
        String s = new String("");
        MyClass m = new MyClass();
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        int sum = 0;
        //System.out.println(s.length());
        for(int i =0;i<s.length();i++){
            sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        //m.prime(sum);
        String rev  = new String("");
        s = String.valueOf(sum);
        for(int i =s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}
