/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeapyrRnot;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sri Kumaran DR
 */
public class LeapyrRnot {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       if(sc.hasNextInt()){
            int year = sc.nextInt();
            if(((year%4==0)||(year%400==0))&&(year%100!=0))
               System.out.println("yes");
            else
                System.out.println("no");
        }
        else
           System.out.println("Invalid input");
           
    }
    
}
