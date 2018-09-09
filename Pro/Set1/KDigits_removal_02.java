import java.util.Scanner;
public class kDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s_orig = new String(sc.next());
        String s = new String(s_orig);
        int k = sc.nextInt();
        int pos=0;
        int start=0;
        int end = k;
        
        for(int i=0;i<k;i++){
            String temp = new String(s.substring(0,s.length()-end+i));    
            int max = Integer.parseInt(String.valueOf(temp.charAt(0)));
            pos =0;
            for(int j=0;j<temp.length();j++){
                if(max<=Integer.parseInt(String.valueOf(temp.charAt(j)))){
                    max = Integer.parseInt(String.valueOf(temp.charAt(j)));
                    pos = j;
                }
            }
            if(pos == 0){
                s = s.substring(pos+1,s.length());
            }
            else{
                s = s.substring(0,pos)+s.substring(pos+1,s.length());
            }
        }
        System.out.println(s);
    }    
}
