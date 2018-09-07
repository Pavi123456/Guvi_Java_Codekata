import java.util.Scanner;
public class Max{
    public static void main(String[] args){
        int a[] = new int[1000];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        for(int i =0;i<n-1;i++){
            for (int j = 0; j < n-i-1; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        //}
        
        if(n%2==1)
            System.out.print(a[(n/2)]);
        else
            System.out.print((a[(n/2)-1]+a[n/2])/2);
    }
}
