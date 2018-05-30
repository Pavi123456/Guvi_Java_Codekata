import java.util.Scanner;
public class MyClass {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b,i,j,flag=0;
        a = sc.nextInt();
        b = sc.nextInt();
        if((a<=100000)&&(b<=100000)){
            for(i=a;i<=b;i++){
                if(i==1){
                    i++;
                }
                else if(i==2){
                    System.out.print(i+" ");
                }
                else{
                    for(j=2;j<i;j++){
                        if(i%j==0){
                            flag=2;
                            break;
                        }
                        else{
                            flag=1;
                        }
                    }
                    if(flag==1)
                        System.out.print(i+" ");
                }
            }
        }
        else{
            System.out.println("Enter no. within 100000 only");
        }
    }
}
