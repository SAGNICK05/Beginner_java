import java.util.Scanner;
class Pronic{
    int num;
    Pronic ()
    {
       num=0;
    }
    void accept()	
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
    }
    boolean pronic(int n)	
    {
        int p=0;
        boolean b=false;
        for(int i=1;i<n;i++)
        {
          if(n==(i*(i+1)))
          {
          b=true;
          break;
        }
          else
          b=false;
        }
        return b;
    }
    void display()
    {
        if(pronic(num)==true)
        System.out.println("Pronic number");
        else
        System.out.println("not a Pronic number");
    }
    public static void main(String[]args)
    {
        Pronic o=new Pronic();
        o.accept();
        o.display();
    }
}
    