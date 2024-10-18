import java.util.Scanner;
class Diamond_pattern
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int n=sc.nextInt();
        for(int k=1;k<=n;k++)
        {
            for(int i=1;i<=n-k;i++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*k-1;j++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=n-1;k>=1;k--)
        {
            for(int i=1;i<=n-k;i++){
                
                System.out.print(" ");
            }
            for(int j=1;j<=2*k-1;j++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}