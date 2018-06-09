import java.util.Scanner;
public class PrimeOnes{
    public static void main(String[] args){
        PrimeOnes o = new PrimeOnes();
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int val = i;
            int ones=0;
            //System.out.println("1.......................val ="+val+" ones ="+ones);
            while(val>1){
                if((val%2)==1){
                    ones++;
                    //System.out.println("2.......................val ="+val+" ones ="+ones);
                }
                val=val/2;
                if(val==1){
                    ones++;
                }
                //System.out.println("3.......................val ="+val+" ones ="+ones);
            }
            c += o.prime(ones);
        }
        System.out.println(c);
    }
    public int prime(int p){
        int val = p;
        //System.out.println("FFFFF1.......................val ="+val);
        if((val==1)||(val==0)){
            //System.out.println("FFFFFF2.......................zero");
            return 0;
        }
        else if(val==2){
            //System.out.println("FFFFFF3.......................one");
            return 1;
        }
        else{
            int i;
            //System.out.println("FFFFFF4.......................LOOP val ="+val);
            for(i=2;i<val;i++){
                
                if(val%i==0){
                    //System.out.println("FFFFFF5.......................Zero val="+val+" i="+i);
                    return 0;
                }
            }
            if(i==val){
                    //System.out.println("FFFFFF5.......................ONE val="+val+" i="+i);
                    return 1;
                }
        }
        return 0;
    }
}
