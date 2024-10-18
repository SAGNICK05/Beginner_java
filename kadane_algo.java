import java.io.*;
class kadane_algo
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the siz of array");
        int n=Integer.parseInt(obj.readLine());
        int a[]=new int[n];
        System.out.println("enter he elements of the array");
        for(int i=0;i<n;i++)
            a[i]=Integer.parseInt(obj.readLine());
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;
        int s=0,start=0,end=0;
        for(int i=0;i<=n-1;i++)
        {
            max_ending_here+=a[i];
            if(max_so_far<max_ending_here)
            {
                max_so_far=max_ending_here;
                start=s;
                end=i;
            }
            else
            if(max_ending_here<0)
            {
                max_ending_here=0;
                s=i+1;
            }
        }

        System.out.println("the maximum continous sum="+max_so_far);
    }
}