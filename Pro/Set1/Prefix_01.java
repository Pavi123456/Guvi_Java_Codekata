import java.util.Scanner;
 public class prefix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String a[] = new String[1000];
        
        for(int i=0;i<n;i++){
            a[i] = sc.next();
        }
        
        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j].length()>a[j+1].length()){
                    String temp = new String(a[j+1]);
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        // for(int i =0;i<n;i++){
        //     System.out.println(a[i]);
        // }
        
        String temp,max;
        temp=new String("");
        max = new String("");
        
        for(int i=1;i<=a[0].length();i++){
            temp=a[0].substring(0,i);
            // System.out.println("temp = "+temp);
            int j=1;
            while((temp.equals(a[j].substring(0,i)))&&(j<n)){
                // System.out.println("While - a[j]Substring = "+ a[j].substring(0,i));
                max = temp;
                j++;
                if(j==n){
                    break;
                }
            }
        }
        System.out.println(max);
    }
 }
