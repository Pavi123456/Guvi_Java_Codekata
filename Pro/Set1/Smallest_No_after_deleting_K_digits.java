import java.util.Scanner;
import java.lang.Math;
class ALL{
    public static void main(String[] args){
        Scanner scc = new Scanner(System.in);
        long ip = scc.nextLong();
        
        long d=scc.nextLong();
        
        long k,div,result,n;
        n=result=div=0;
        k=(long)(Math.log10(ip)+1);
        
        for(int i=0;i<=d-1;i++){
            k=k-1;
        }
        
        div=(long)Math.pow(10,k);
  
        result = ip/div;
        result=result*div;
        result=ip-result;
        System.out.println(result);   
    }  
}
