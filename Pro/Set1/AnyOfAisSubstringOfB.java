import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a,b;
        a=sc.next();
        b=sc.next();
        a=a.replace(" ","");
        b=b.replace(" ","");
        a=a.toUpperCase();
        b=b.toUpperCase();
        int flag=0;
        outerloop:
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<a.length();j++){
                if(b.contains(a.substring(i,j+1))){
                    System.out.println("yes");
                    flag=1;
                    break outerloop;
                }
                
            }
        }
        if(flag==0){
            System.out.println("no");
        }
    }
}
