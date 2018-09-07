import java.util.Scanner;
public class ArrayIndex{
    public static void main(String[] args){
        int a[] = new int[1000];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(sc.nextInt()+" "+i);
        }
    }
}
