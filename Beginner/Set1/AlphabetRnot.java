/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowelRconsonant;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sri Kumaran DR
 */
public class vowelRconsonant {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c = sc.next().charAt(0);
        if(((c>='A')&&(c<='Z'))||((c>='a')&&(c<='z'))){
            System.out.println("Alphabet");
        }
        else 
            System.out.println("Not an alphabet");
    }
    
}
