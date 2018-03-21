/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primernot;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Sri Kumaran DR
 */
public class PrimeRnot {
    
    public void prime(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int flag='\0';
        try {
//            if(sc.hasNextDouble()){
//                num = (int)sc.nextDouble();
//            }
//            else{
                num=sc.nextInt();
//            }
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
                System.out.println(flag==1?"yes":"no");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input");
            System.exit(0);
        }
   
    }
    
    public static void main(String[] args) {
        PrimeRnot p = new PrimeRnot();
        p.prime();
        
    }
    
}
