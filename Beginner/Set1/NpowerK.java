/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npowerx;
import java.util.Scanner;
/**
 *
 * @author Sri Kumaran DR
 */
public class NPowerX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=0,p=0;
        if(sc.hasNextDouble()){
            n = sc.nextDouble();
        }
        else {
            System.out.println("Invalid input");
            System.exit(0);
        }
        if(sc.hasNextDouble()){
            p = sc.nextDouble();
        }
        else {
            System.out.println("Invalid input");
            System.exit(0);
        }
        System.out.println(Math.pow(n,p));
        
    }
    
}
