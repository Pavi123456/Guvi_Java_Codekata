import java.util.Scanner;

public class PrimeRnot {
    
    public void prime(){
        
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int flag=0;
        
        if(num==1){
            System.out.println("Neither Prime nor Composite");
        }
        else if(num==2){
            System.out.println("yes");
        }
        else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    flag = 2;
                    break;
                }
                else 
                    flag=1;
            }
            System.out.println(flag==1?"no":"no");
        }
    }

    public static void main(String[] args) {
        PrimeRnot p = new PrimeRnot();
        p.prime();
    }
}
