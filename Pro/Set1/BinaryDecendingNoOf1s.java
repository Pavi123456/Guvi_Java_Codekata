import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10000];
        int b[]=new int[10000];
        int n;
        //String s="";
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count,temp,j;
            count=0;
            temp=a[i];
            while(temp>0){
              j=temp%2;
              //s = j+s;
              if(j==1){
                count=count+1;  
              }
              temp=temp/2;
            }
            b[i]=count;
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(b[j]==b[j+1]){
                    if(a[j]<a[j+1]){
                        int temp3 = a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp3;
                    }
                }
                else if(b[j]<b[j+1]){
                    int temp1=b[j]; int temp2 = a[j];
                    b[j]=b[j+1];    a[j]=a[j+1];
                    b[j+1]=temp1;    a[j+1]=temp2;     
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
