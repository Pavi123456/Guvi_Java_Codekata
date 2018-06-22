import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        String s  = new String("");
        String result  = new String("");
        String s1; 
        char c = '\0';
        int n = 0;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        int p =0;
        /*System.out.println("IP = "+s);*/
        for(int i =0;i<s.length();i++){
            s1 = new String("");
            if(Character.isLetter(s.charAt(i))){
                c = s.charAt(i);
                /*System.out.println("Character = "+c);*/
                p=1;
                continue;
            }
            if((Character.isDigit(s.charAt(i)))&&(p==1)){
                /*if(Character.isDigit(s.charAt(i+1))){
                    s1 = s.charAt(i)+s.*/
                    int j = i;
                    /*System.out.println("j = "+j+" i = "+i);*/
                    while(Character.isDigit(s.charAt(j))){
                        s1 = s1 + s.charAt(j);
                        /*System.out.println("S1 string = "+s1);*/
                        j++;
                        if(j==s.length()){
                            /*System.out.println("************************ j= "+j);*/
                             break;
                        }
                        /*System.out.println("************************ j= "+j);*/
                    }
                    if(s1.length()>1){
                        n = Integer.parseInt(s1);
                        p=0;
                    }
                    else{
                        n = Integer.parseInt(String.valueOf(s1));
                    }
                    /*System.out.println(" n = "+n);*/
                    for(int k =0;k<n;k++){
                        result = result + c;
                        /*System.out.println("result = "+result);*/
                        
                    }
            }
        }
        System.out.println(/*"Result ="+*/result);
    }
}        

