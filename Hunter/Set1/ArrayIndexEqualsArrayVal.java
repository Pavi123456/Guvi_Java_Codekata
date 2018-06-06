import java.util.Scanner;
public class RepeatedNos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100000];
        int n=sc.nextInt();
        String s= new String("");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i] == i){
                s = s+a[i]+" ";
            }
        }
        int pos = s.lastIndexOf(" ");
        s = s.substring(0,pos);
        System.out.println(s);
    }
}
