import java.io.*;
class almost_prime{
    private int n,cnt,rng;
    public almost_prime()
    {
        n=0;
        cnt=0;
    }

    void accept()throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter The Range = ");
        rng=Integer.parseInt(obj.readLine());
    }

    int prime(int p)
    {
        int f=0;
        for(int i=2;i<p;i++)
        {
            if(p%i==0)
                f=1;
        }
        return(f);
    }

    void find_factor(int n)
    {
        cnt=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                if(prime(i)==0)
                    cnt++;
            }
        }

    }

    void almost_prime(int n)
    {
        int chk=prime(n);
        if(chk!=0)
        {
            find_factor(n);
            int fact[]=new int[cnt];
            int i,j=0;
            for(i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    if(prime(i)==0){
                        fact[j]=i;
                        j++;
                    }
                }
            }

            int n2=n,s=1,c=0;

            for(i=0;i<fact.length;i++)
            {

                while(n>0)
                {
                    if(n%fact[i]==0 && fact[i]!=0)
                    {
                        s=s*fact[i];
                        c++;
                    }
                    else
                        break;
                    n=n/fact[i];
                }
            }
            if(s==n2)
                System.out.println(c+" Almost Prime No. Is = "+s);
        }
    }

    void show()
    {
        for(int i=2;i<=rng;i++)
        {
            almost_prime(i);
        }
    }

    public static void main(String args[])throws IOException
    {
        almost_prime obj=new almost_prime();
        obj.accept();
        obj.show();
        //obj.show();
    }
}
