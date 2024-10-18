import java.util.*;
class Mirror_matrix
{
    public static void main(String[]args)throws InputMismatchException
    {

        int M, i, j, k, t;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows for a square matrix: ");
        M= scan.nextInt();

        if(M<=2 || M>=20){
            System.out.println("\nSIZE OUT OF RANGE");
        }else{

            int A[][] = new int [M][M];

            System.out.println("Enter "+(M*M) + " elements: ");
            for(i=0;i < M;i++){
                for(j=0;j < M;j++){
                    A[i][j] = scan.nextInt();
                }
            }

            //DISPLAY THE ORIGINAL MATRIX
            System.out.println("ORIGINAL MATRIX");
            for(i=0;i < M;i++){
                for(j=0;j < M;j++){
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }

            //USE TWO COUNTERS FOR ACCESSING COLUMNS -
            // ONE INCREMENTAL, ONE DECREMENTAL

            for(j=0, k = M-1; j < M/2; j++, k--){

                for(i=0;i < M; i++){
                    //SWAP THE ELEMENTS OF THE FIRST COLUMN WITH THE LAST,
                    //SECOND COLUMN WITH SECOND LAST AND SO ON

                    t = A[i][j];
                    A[i][j] = A[i][k];
                    A[i][k] = t;

                }
            }

            //DISPLAY THE MIRROR IMAGE MATRIX
            System.out.println("MATRIX MIRROR IMAGE");
            for(i=0;i < M;i++){
                for(j=0;j < M;j++){
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }

        }//END OF ELSE

    }//END OF MAIN
}//END OF CLASS