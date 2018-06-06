import java.util.Scanner;
public class RepeatedNos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100000];
        int n =sc.nextInt();
        String s = new String("");
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(i<j){
                    int sum =a[i]+a[j];
                    for(int k=j+1;k<=n;k++){
                        if((sum==a[k])&&(j<k)){
                            System.out.println(a[i]+" "+a[j]+" "+a[k]);
                        }
                    }
                }
            }    
        }
    }
}
