/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import java.util.Scanner;
/**
 *
 * @author Sri Kumaran DR
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0,k=0,j=0;
        if((sc.hasNextInt())&&(sc.nextInt()<=1000)){
            n=sc.nextInt();
        }
        else{
            System.out.println("Invalid input");
            System.exit(0);
        }
        j=n;
        
        for(int i=1;n>0;i*=10){
        k+=(n%10)*i;
        n=n/10;
        }
        
        System.out.println((k==j)?"yes":"no");
    
    }
    
}
