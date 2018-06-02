import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int flag=0;
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100000];
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        outerloop:
        for(int l=0;l<n;l++){
            for(int j=l+1;j<n;j++){
                System.out.println(a[l]+" + "+a[j]+" Sum = "+(a[l]+a[j]));
                if((a[l]+a[j])==k){
                    //System.out.println("yes");
                    flag=1;
                    break outerloop;
                }
            }System.out.println(".........................................");
        }
        if(flag==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
