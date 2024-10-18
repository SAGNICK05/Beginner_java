import java.util.Scanner;
class upcounting_number{
    int n;
    void upcounting_number()
    {
        n=0;
    }

    void accept()
    {
        Scanner sc=new Scanner(System.in);  
        do
        {
            System.out.println("enter a number");
            n=sc.nextInt();
        }while(isUpcounting(n)==true);
    }

    int CountDigits(int p)
    {
        int c=0;
        while(p>0)
        {
            p=p/10;
            c++;            
        }
        return c;
    }

    boolean isUpcounting(int k)
    {
        boolean bo=false;
        if(CountDigits(k)==3)
        {
            int a=k%10;
            int b=k/10;
            int c=b%10;
            int d=b/10;
            if(a==c+1&&c==d+1)
                bo=true;
            else
                bo=false;
        }
        return bo;
    }																																																																																																																																																																													

    void nextUpcounting()
    {
        for(int i=(n+1);i<=999;i++)
        {
            if(isUpcounting(i)==true)
            {
                System.out.println("the next upcounting number = "+i);
                break;
            }
            else
                continue;
        }
    }

    public static void main(String[]args)
    {
        upcounting_number n=new upcounting_number(); 
        n.accept();
        n.nextUpcounting();
    }
}