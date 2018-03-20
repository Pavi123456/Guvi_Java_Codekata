/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumnnaturalnos;

import java.util.Scanner;

/**
 *
 * @author Sri Kumaran DR
 */
public class SumNnaturalNos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
       if(sc.hasNextDouble()){
            double N = sc.nextDouble();
            if(N<0)
                System.out.println("Enter Positive Integer");
            else{
                for(int i=1;i<=(int)N;i++)
                    sum +=i;
                System.out.println(sum);
            }        
        }
        else
           System.out.println("Invalid input");
    }
    
}
