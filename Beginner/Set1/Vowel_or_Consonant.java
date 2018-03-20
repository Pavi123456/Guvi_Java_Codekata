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
        char c = '\0';
        try{
        c = sc.next().charAt(0);
        }
        catch(InputMismatchException e){
            System.out.println("Enter a single letter only");
            System.exit(0);
        }
        if((c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U'))
            System.out.println("Vowel");
        else 
            System.out.println("Consonant");
    }
    
}
