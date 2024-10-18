import java.util.*;
public class SquareMatrix {
    public static void main(String args[]){
        int 
        l,t1;
        Scanner sc=new Scanner(System .in);
        System.out.println("The combination number of Square matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        if(n>3 && n<10)
        {
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            int m=a.length;
            System.out.println("Entered matrix is");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println(" " );
            }
            int k=n,suml=0,sumr=0;
            int ld[]=new int[n];
            int rd[]=new int[n];
            System.out.println("Sum of Diagonals");
            for(int i=0;i<n;i++){
                suml=suml+a[i][i];
                k=k-1;
                rd[i]=a[i][k];
                sumr=sumr+a[i][k];
            }
            System.out.println("Sum of left diagonal elements="+suml);
            System.out.println("Sum of right diagonal elements="+sumr);
            System.out.println("Sum total of all the diagonals="+(suml+sumr));
            System.out.println("Carving out non boundary elements");
            int nb[][]=new int[m-2][m-2];
            int k1=0,k2=0;
            for(int i=1;i<m-1;i++){
                for(int j=1;j<m-1;j++){
                    System.out.println("The non boundary elements are:");
                    int a1[]=new int[(m-2)*(m-2)];
                    int k5=0;
                    for(int p=1;p<m-1;p++){
                        for(int d=1;d<m-1;d++){
                            a1[k5++]=nb[i-1][j-1];
                            System.out.print(nb[i-1][j-1]+" ");
                        }
                        System.out.println();
                    }
                    for(int v=0;v<((m-2)*(m-2));v++){
                        System.out.println("A1 Array:"+a1[i]+" ");
                    }
                    l=((m-2)*(m-2));
                    int st[][]=new int[l][l];
                    l=a1.length;
                    for(int i=0;i<l;i++){
                        for(int j=1;j<(l-i);j++){
                            if(a1[j-1] > a1[j])
                            {
                                int t=a1[j-1];
                                a1[j-1]=a1[j];
                                a1[j]=t;
                            }
                        }
                    }
                    int k6=0;
                    for(int i=0;i<(m-2);i++){
                        for(int j=0;j<(m-2);j++){
                            st[i][j]=a1[k6++];
                        }}
                    System.out.println("Arrays unbounded portion printed in sorted order");
                    for(int i=0;i<(m-2);i++){
                        for(int j=0;j<(m-2);j++){
                            System.out.print(st[i][j]+" ");
                        }
                        System.out.println();
                    }
                    System.out.println("Left diagonal element of the sorted unboundary elements");
                    for(int i2=0;i2<m-2;i2++){
                        System.out.print(st[i2][i2]+" ");
                    }
                    int k4=m-2;
                    System.out.println();
                    System.out.println("Right diagonal element of the sorted unboundary elements");
                    for(int i3=0;i3<m-2;i3++){
                        k4=k4-1;
                        System.out.print(st[i3][k4]+" ");
                    }
                }
                {
                    System.out.println("Out of Range, Invalid Input");
                }
            }
        }
    }
}