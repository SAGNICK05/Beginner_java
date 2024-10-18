import java.io.*;
class unique
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int c,n1,ch;
        int flag=0;
        System.out.println("enter the number");
        int n=Integer.parseInt(obj.readLine());
        while(n>0)
        {
            c=n%10;
            n/=10;
            n1=n;
            while(n1>0)
            {
                ch=n1%10;
                if(c==ch)
                {
                   flag++;
                   break;
                }
                n1/=10;
            }
        }
        if(flag==0)
        System.out.println("the number is unique number");
        else
        System.out.println("the numnber is not an unique number");
     }
}

            