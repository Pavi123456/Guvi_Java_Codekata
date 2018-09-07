import java.util.Scanner;
public class HM{
    public static void main(String[] args){
        int h1,m1,h2,m2;
        Scanner sc = new Scanner(System.in);
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        h2 = sc.nextInt();
        m2 = sc.nextInt();
        int count =0;
        if(h2>h1){
            while((m1!=m2)||(h1!=h2)){
                if(m1==60){
                    m1=0;
                    h1++;
                    if((m1==m2)&&(h1==h2)){
                        break;
                    }
                }
                m1++;
                count++;
            }
        }
        else if(h1>h2){
            while((m1!=m2)||(h1!=h2)){
                if(m2==60){
                    m2=0;
                    h2++;
                    if((m1==m2)&&(h1==h2)){
                        break;
                    }
                }
                m2++;
                count++;
             
            }
        }
        int hr,mr;
        hr=0;
        mr=0;
        while(count>=60){
            count-=60;
            hr++;
        }
        mr = count;
        System.out.println(hr+ " "+ mr);
    }
}
