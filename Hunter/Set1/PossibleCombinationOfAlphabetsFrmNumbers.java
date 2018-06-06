import java.util.Scanner;
public class RepeatedNos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val,n,count;
        n=sc.nextInt();
        val=0;
        String s = new String("");
        s=String.valueOf(n);
        //System.out.println(s);
        count=0;
        outerloop:
        for(int i=0;i<s.length();i++){
            String t=new String("");
            t = String.valueOf(s.charAt(i));
            val = Integer.parseInt(t);
            if(val>0){
                for(int j=i+1;j<s.length();j++){
                    String t1=new String("");
                    int val1;
                    t1 = String.valueOf(s.charAt(j));
                    val1 = Integer.parseInt(t1);
                    if(val1==0){
                        break outerloop;
                    }
                }
                count=1;
                break;
            }  
        }
        for(int i=0;i<s.length()-1;i++){
            int val1,val2;
            String s1 = new String("");
            String s2 = new String("");
            //s1 = String.valueOf(s.charAt(i)+s.charAt(i+1));
            //s2 = String.valueOf(s.charAt(i+1));
            s1=String.valueOf(s.charAt(i))+String.valueOf(s.charAt(i+1));
            //System.out.println("s1 = "+s1);
            val1=Integer.parseInt(s1);
            //val2=Integer.parseInt(s2);
            //System.out.println("Val1 = "+val1+" Val2 = "+val2);
            //////////////////////////System.out.println("Val1 = "+val1);
            //if(((val1+val2)>0)&&((val1+val2)<27)){
            if((val1>0)&&(val1<27)){
                
                count++;
            }
            
        }System.out.println(count);
    }
}
