import java.io.*; 
class IMEI 
{ 
    static int sumDig(int n) 
    { 
        int a = 0; 
        while (n > 0) 
        { 
            a = a + n % 10; 
            n = n / 10; 
        } 
        return a; 
    }   

    static boolean isValidIMEI(long n) 
    { 
        String s = Long.toString(n); 
        int len = s.length();   
        if (len != 15) 
            return false;   
        int sum = 0; 
        for (int i = len; i >= 1; i--) 
        { 
            int d = (int)(n % 10); 
            if (i % 2 == 0) 
                d = 2 * d;              
            sum += sumDig(d); 
            n = n / 10; 
        } 
        return (sum % 10 == 0); 
    } 

    public static void main(String args[]) throws IOException 
    {        
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a number");
        long n=Long.parseLong(obj.readLine());
        if (isValidIMEI(n)) 
            System.out.println(n+" - Is an IMEI Number"); 
        else
            System.out.println(n+" - Is not an IMEI Number");   
    } 
} 
