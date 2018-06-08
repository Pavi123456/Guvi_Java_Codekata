import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        int k,l;
        int a[][]=new int[10000][10000];
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                a[i][j]=sc.nextInt();
                //System.out.print(a[i][j]+" ");
            }
            //System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(a[i][j]==1){
                    int pi=i;
                    int pj=j;
                    //System.out.println(".....................one at i="+i+", j="+j);
                    int rs,re,cs,ce;
                    rs=re=cs=ce=0;
                    if(pi==0){
                        rs=0;
                        re=pi+1;
                    }
                    else if(pi==n-1){
                        rs=pi-1;
                        re=n-1;
                    }
                    if(pj==0){
                        cs=0;
                        ce=pj+1;
                    }
                    else if(pj==n-1){
                        cs=pj-1;
                        ce=n-1;
                    }
                    if(((pi==0)||(pi==n-1))&&((pj!=0)&&(pj!=n-1))){
                        cs=pj-1;
                        ce=pj+1;
                    }
                    else if(((pi!=0)&&(pi!=n-1))&&((pj!=0)||(pj!=n-1))){
                        rs=pi-1;
                        re=pi+1;
                    }
                    else if(((pi!=0)&&(pi!=n-1))&&((pj!=0)&&(pj!=n-1))){
                        rs=pi-1;
                        re=pi+1;
                        cs=pj-1;
                        ce=pj+1;
                    }
                    //System.out.println("rs ="+rs+" re ="+re+" cs="+cs+" ce="+ce);
                    ThisIteration:
                    for(k=rs;k<=re;k++){
                        for(l=cs;l<=ce;l++){
                            //System.out.println("k = "+k+" L = "+l);
                            if((k==pi)&&(l==pj)){
                                if((k==re)&&(l==ce)){
                                //System.out.println("incrementing");
                                count++;
                                }
                                //System.out.println("continued");
                                continue;
                            }
                            else if(a[k][l]==1){
                                //System.out.println("Iteration broken");
                                break ThisIteration;
                            }
                            if((k==re)&&(l==ce)){
                                //System.out.println("incrementing");
                                count++;
                            }
                        }
                    }
                }   
            }
        }
        System.out.println(count);
    }
}
