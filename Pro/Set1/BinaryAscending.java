import java.util.*;
import java.lang.Math;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ip = n;
        int a[]=new int[10000];
        int c[]=new int[10000];
        String b[]=new String[10000];
        n=(int)Math.pow(2,ip);
        //System.out.println(n);
        for(int i=0;i<n;i++){
            a[i]=i;
            //System.out.println(a[i]);
            int temp = i;
            int count =0;
            while(temp>0){
                int j=temp%2;
                if(j==1){
                    count++;
                }
                temp=temp/2;
            }
            c[i]=count;
            b[i]=Integer.toBinaryString(a[i]);
            for(int l=0;b[i].length()<ip;l++){
                b[i]="0"+b[i];
            }
            //b[i]=String.format("%4s", b[i]);
            //b[i]=b[i].replace(" ","0");
            //b[0]="0000";
            //System.out.println("no = "+a[i]+" binary = "+b[i]+" ones = "+c[i]);
            //System.out.println("no = "+a[i]+" binary = "+b[i]);
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<n-j-1;i++){
                if(c[i]==c[i+1]){
                    if(a[i]>a[i+1]){
                        int tempc = c[i];       int tempa = a[i];     String temps = b[i];
                    c[i]=c[i+1];                a[i] = a[i+1];    b[i] = b[i+1];
                    c[i+1]=tempc;                a[i+1] = tempa;   b[i+1] = temps;
                    }
                }
                else if(c[i]>c[i+1]){
                    int tempc = c[i]; int tempa = a[i];     String temps = b[i];
                    c[i]=c[i+1];      a[i] = a[i+1];        b[i] = b[i+1];
                    c[i+1]=tempc;      a[i+1] = tempa;       b[i+1] = temps;
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(b[i]);
    }
}
