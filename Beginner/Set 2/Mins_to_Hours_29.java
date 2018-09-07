import java.util.Scanner;
public class HM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int hr=0;
        while(m>=60){
            m-=60;
            hr++;
        }
        System.out.println(hr+" "+m);
    }    
}
