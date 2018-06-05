import java.math.BigInteger;
import java.util.Scanner;
public class MyClass {
     static BigInteger factorial(int N1, int N2)
    {
        BigInteger f1 = new BigInteger("1");
        //BigInteger f2 = new BigInteger("1");
        //BigInteger div = new BigInteger("1");
        /*for (int i = 2; i <= N1; i++){
            f1 = f1.multiply(BigInteger.valueOf(i));
        }
        f1 = f1.multiply("*******************"+BigInteger.valueOf(i));
        System.out.println("fact 1 = "+f1);
        for (int i = 2; i <= N2; i++){
            f2 = f2.multiply(BigInteger.valueOf(i));
        }
        System.out.println("fact 2 = "+f2);
        div=f1.divide(f2);
        //System.out.println(" n = f1/f2 = "+(f1/f2));
        return div;*/
        for(int i =N2+1;i<=N1;i++)
            f1 = f1.multiply(BigInteger.valueOf(i));
        return f1;
    }
    public static void main(String args[]) {
        MyClass m = new MyClass();
        int count,a,b;
        BigInteger n = new BigInteger("1");
        int t;
        Scanner sc = new Scanner(System.in);
        t= sc.nextInt();
        for(int j=0;j<t;j++){
            a=sc.nextInt();
            b=sc.nextInt();
            /*for(int fact=1;fact<=a;fact++){
                fa=fa*fact;
                System.out.println("fact a = "+fa);
            }
            System.out.println("fact a********** = "+fa);
            for(int fact2=2;fact2<=b;fact2++){
                fb=fb*fact2;
                System.out.println("Fact b = "+fb);
            }
            System.out.println("Fact b********** = "+fb);*/
            n=m.factorial(a,b);
            count=0;
            BigInteger i = new BigInteger("2");
            BigInteger k = new BigInteger("1");
            int cmp=n.compareTo(k);
                while(cmp==1){
                    BigInteger z=new BigInteger("0");
                    BigInteger one = new BigInteger("1");
                    int iff = z.compareTo(n.mod(i));
                    if(iff==0){
                        n=(n.divide(i));
                        i=BigInteger.valueOf(2);
                        count+=1;
                        //System.out.println("N = "+n+" ")
                    }
                    else{
                    i=i.add(one);
                    }
                    cmp=n.compareTo(k);
                }
            System.out.println("Count = " +count);
        }   
    }
}
