import java.util.Scanner;
public class RepeatedNos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100000];
        int b[]=new int[100000];
        int n =sc.nextInt();
        int m = sc.nextInt();
        int count=0;
        String s = new String("");
        String s1 = new String("");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            s1=s1+b[i];
            String h = new String("");
            h=String.valueOf(s1.charAt(i));
            if(s.contains(h)){
               count++; 
            }
        }
        //System.out.println("Count = "+count+" length of b string = "+s1.length());
        if(count==s1.length()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
        
    }
}
