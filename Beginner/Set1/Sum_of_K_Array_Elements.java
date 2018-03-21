/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofndigitsinarray;
import java.util.Scanner;
/**
 *
 * @author Sri Kumaran DR
 */
public class SumOfNdigitsInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[20];
        double K=0,sum=0,N=0;
        if(sc.hasNextDouble()){
            N = (int)sc.nextDouble();
        }
        else{
            System.out.println("Invalid input");
            System.exit(0);
        }
        if(sc.hasNextDouble()){
            K = (int)sc.nextDouble();
        }
        else{
            System.out.println("Invalid input");
            System.exit(0);
        }
        for(int i=0;i<N;i++){
            if(sc.hasNextDouble())
                arr[i]=sc.nextDouble();           
        }
        for(int i=0;i<K;i++){
             sum+=arr[i];
        }
        System.out.println(sum);
            
    }
    
}
