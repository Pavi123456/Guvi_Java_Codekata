import java.util.Scanner;
public class RepeatedNos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[100000];
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i] == i){
                System.out.print(a[i]+" ");
            }
        }
    }
}
