import java.io.*;
class Prime_recur
{
    static int f=0,i=0;
    static int isPrime(int n)
    {
        i++;
        if(i>n)
        return f;
        else{
          if(n%i==0)
             f++;
          return(isPrime(n));
        }
    }
    
    public static void main(String[]args)throws IOException 
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        int n=Integer.parseInt(obj.readLine());
        if(isPrime(n)==2)
        System.out.println("it is prime");
        else
        System.out.println("it is not primr");
    }
}
        