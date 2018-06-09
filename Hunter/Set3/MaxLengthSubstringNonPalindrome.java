import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Palindrome p = new Palindrome();
        Scanner sc = new Scanner(System.in);
        String s = new String("");
        int m =0;
        String a[] = new String[100000]; 
        s=sc.nextLine();
        //System.out.println("String ="+s+" Length ="+s.length());
        String s1,r1;
        s1 = new String("");
        r1 = new String("");
        for(int i=0;i<=s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                s1=s.substring(i,j);
                r1="";
                for(int k=s1.length()-1;k>=0;k--){
                    r1=r1+s1.charAt(k);
                    //System.out.println("r ="+r1);
                }
                //System.out.println("substring = "+s1+" rev ="+r1);
                //System.out.println("reverse = "+r1);
                if(!s1.equals(r1)){
                    a[m]=s1;
                    m++;
                }
            }
        }
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<m-1-i;j++){
                
                int max = a[j].length();
                if(max<(a[j+1].length())){
                    max = a[j+1].length();
                    String temp = new String("");
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(a[0]);
    }
}
