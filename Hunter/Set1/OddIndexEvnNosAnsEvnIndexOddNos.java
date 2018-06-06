import java.util.Scanner;
public class RepeatedNos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100000];
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if((i%2==0)&&(a[i]%2==1)){
                System.out.print(a[i]+" ");
            }
            else if((i%2==1)&&(a[i]%2==0)){
                System.out.print(a[i]+" ");
            } 
        }
    }
}
