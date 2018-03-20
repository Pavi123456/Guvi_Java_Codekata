/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestOfThree;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sri Kumaran DR
 */
public class largestOfThree {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int i;
        array = new int[10];
        for(i=0;i<3;i++){
            if(sc.hasNextInt())
                array[i]=sc.nextInt();
            else 
                System.out.println("Invalid Input");
        }
        if((array[0]>array[1])&&(array[0]>array[2]))    
            System.out.println(array[0]);
        else if((array[1]>array[2])&&(array[1]>array[0]))
            System.out.println(array[1]);
        else
            System.out.println(array[2]);
        
    }
    
}
