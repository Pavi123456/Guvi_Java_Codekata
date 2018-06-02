import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int n,q,u,v,j,sum,temp;
        sum=0;
        int a[]=new int[100000];
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        q=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            sum=0;
            u=sc.nextInt();
            u=u-1;
            v=sc.nextInt();
            for(int k=u;k<v-1;k++){    
                for(j=u+1;j<v-1;j++){
                    if(a[j]>a[j+1]){
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }    
                }
            }
            System.out.println(a[v-1]);
        }
    }
}
