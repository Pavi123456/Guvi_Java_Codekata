import java.util.Scanner;
public class RepeatedNos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100000];
        int n =sc.nextInt();
        String s = new String("");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        for(int i=0;i<n;i++){
            int pos = s.lastIndexOf(s.charAt(i));
            if(pos!=i){
                System.out.println(s.charAt(i));
                break;
            }
            if(i==n-1){
                System.out.println("unique");
            }
        }
       
    }
}
