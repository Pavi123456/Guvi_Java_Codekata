import java.util.*;
import java.lang.Math;
public class AL{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = new String();
        s1=sc.nextLine();
        //System.out.println("Original String = "+s1);
        for(int i=0;i<s1.length();i++){
            while(s1.lastIndexOf(s1.charAt(i))!=i){
                if((s1.lastIndexOf(s1.charAt(i))!=i)&&(s1.lastIndexOf(s1.charAt(i))!=-1)){
                    s1=removeCharAt(s1,s1.lastIndexOf(s1.charAt(i)));
                }   
            }
        }
        //System.out.println("String after removal of duplicate characters = "+s1);
        System.out.println(s1);
    }
    
    public static String removeCharAt(String str, int pos){
        return str.substring(0,pos) + str.substring(pos+1);
    }
}
