import java.io.*;
class happy_number
{
    int n;
    void accept()throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        n=Integer.parseInt(obj.readLine());
    } 
    
    int sumOfSquares(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=(int)(Math.pow((n%10),2));
            n/=10;
        }
        return sum;
    }
    
    void isHappy()
    {
        int sum=n,flag=0;
        while(true)
        {
            sum=sumOfSquares(sum);
            if(sum<=9)
            {
                flag=1;
                break;
            }
        }
        if(flag==1&&sum==1)
           System.out.println("the number is happy number");
        else
           System.out.println("the number is not happy number");
    }
    
    public static void main(String[]args)throws IOException
    {
        happy_number hn=new happy_number();
        hn.accept();
        hn.isHappy();
    }
}
        