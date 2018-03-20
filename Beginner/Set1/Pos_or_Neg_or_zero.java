/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codekata.beginner.set1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sri Kumaran DR
 */
public class positiveOrNegOrZero {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String result="";
        double n=0;
        try{
            n = sc.nextDouble();
            if(n>100000){
            throw new InputMismatchException("out of range");
            }
        }
        catch(InputMismatchException e){
                System.out.println("Input mismatch enter only integers and less than 100001");
            System.exit(0);
        }
//        catch (IndexOutOfBoundsException o){
//            //System.out.println("Out of range do not enter greater than 100000");
//            throw new InputMismatchException("out of bounds");
//        }
        
        result = n>0? "Positive" :n==0? "Zero" : "Negative";
        System.out.println(result);
        
    }
    
    
}
