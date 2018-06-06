import java.util.Scanner;
public class RepeatedNos{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String s = new String("");
       int n=sc.nextInt();
       int a[] = new int[100000];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
           s=s+a[i];
       }
        while(s.length()>1){    
            for(int i=0;i<s.length();i++){
                int pos = s.lastIndexOf(s.charAt(i));
                if(pos!=i){
                    s=s.replace(Character.toString(s.charAt(pos)),"");
                    //System.out.println(s);
                }
            }
        }
       System.out.println(s);
    }
}
