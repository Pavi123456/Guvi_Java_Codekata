/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkprimeinterval;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sri Kumaran DR
 */
public class CheckPrimeInterval {
    
    public void primeBtwn(){
        Scanner sc = new Scanner(System.in);
        int a,b;
        try{
            a=sc.nextInt();
            b=sc.nextInt(); 
            prime(a,b);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
    public void prime(int x, int y){
        int a,b,flag='\0';    
        a=x;
        b=y;
        for(int i=a;i<=b;i++){
            if(i==1){
            continue;
            }
            else if(i==2){
                System.out.println(i);
            }
            else{
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        flag = 2;
                        break;
                    }
                    else 
                        flag=1;
            }
                if(flag==1){
                    System.out.println(i);
                }
            }
        }
    }
        
    public static void main(String[] args) {
       CheckPrimeInterval  p = new CheckPrimeInterval();
       p.primeBtwn();
    }
    
}
