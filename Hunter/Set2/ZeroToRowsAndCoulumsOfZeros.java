import java.util.Scanner;
public class ZeroColumnRow{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m,n;
        n=sc.nextInt();
        m=sc.nextInt();
        int a[][] = new int[10000][10000];
        int b[][] = new int[10000][10000];
        //System.out.println("Original Matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                b[i][j]=a[i][j];
                //System.out.print(a[i][j]+" ");
            }
            //System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==0){
                    int r=i;
                    int c=j;
                    for(int k=0;k<n;k++){
                        b[k][c]=0;
                    }
                    for(int l=0;l<m;l++){
                        b[r][l]=0;
                    }
                }
            }
        }
        //System.out.println("Altered Matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
