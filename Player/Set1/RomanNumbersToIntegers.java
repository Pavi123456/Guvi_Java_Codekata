import java.util.Scanner;
public class RomanNos{
    public static void main(String[] args){
        String s = new String("");
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        int sum=0;
        s = s.toUpperCase();
        //System.out.println(s);
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='X'){
                sum = sum+10;
                if((i>0)&&(s.charAt(i-1)=='I')){
                    sum=sum-1;
                }
            }
            else if(s.charAt(i)=='V'){
                sum = sum+5;
                if((i>0)&&(s.charAt(i-1)=='I')){
                    sum=sum-1;
                }
            }
            else if(s.charAt(i)=='I'){
                sum = sum+1;
                if(((i+1)<s.length())&&((s.charAt(i+1)=='V')||(s.charAt(i+1)=='X'))){
                    sum = sum-1;
                }
            }
        }
        System.out.println(sum);
    }
}
