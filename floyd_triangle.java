/*
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */
import java.io.*;
class floyd_triangle
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the no of lines");
        int n=Integer.parseInt(obj.readLine());
    int c=1;
    for(int i=1;i<=n;i++){
        for(int p=1;p<=i;p++){
            System.out.print(" "+c+" ");
           c++;
    }
        System.out.println();        
   }
  }
}