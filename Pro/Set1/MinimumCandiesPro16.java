import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int tmc,mc,n,max,pos,temp,sum,flag;
        sum=pos=flag=0;
        int a[]=new int[100000];
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        for(int i=0;i<n;i++){
            if(a[i]==a[i+1]){
                flag=0;
            }
            else{
                flag=1;
            }
        }
        if(flag==1){
            max=a[0];
            for(int i=1;i<n;i++){
                if(max<a[i]){
                    max=a[i];
                    pos=i;
                }
            }
            if(pos==n-1){
                temp=a[pos-1];
            }
            else if(pos==0){
                temp=a[pos+1];
            }else{
            temp=Math.max(a[pos-1],a[pos+1]);
            }
            if(temp==max){
                mc=temp;
            }
            else{
                mc=temp+1;
            }
            tmc=mc+sum-max;
            System.out.println(tmc);
        }
    }
}
