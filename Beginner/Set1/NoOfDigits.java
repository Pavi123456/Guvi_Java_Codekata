/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoOfDigits;

import java.util.Scanner;

/**
 *
 * @author Sri Kumaran DR
 */
public class NoOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=0;
        int i=0;
        if(sc.hasNextDouble()){
            n = sc.nextDouble();
             while((int)n>0){
                n=n/10;
                i++;
            }
            System.out.println(i);
        }
        else{
            System.out.println("Invalid input");
        }
    }
    
}
