import java.util.Scanner;
class telephoneExchange{
    private String cname;int noc;char callType;
    public telephoneExchange()
    {
        cname="";
        noc=0;
        callType='0';
    }
    public telephoneExchange(String c,int n,char a)
    {
       cname=c;
       noc=n;
       callType=a;
    }
    public void acceptCalls()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter customer name");
        cname=sc.nextLine();
        System.out.println("enter the number of calls done");
        noc=sc.nextInt(); 
        System.out.println("enter l to local or STD call and i to ISD call");
        callType=sc.next().charAt(0);        
    }
    public float getBillAmount()
    {
        float nb;
        if (callType=='l' || callType=='L'){
            if(noc<=50)
             nb=0;
            else if(noc<=120)
            nb=noc*1.25f;
            else if(noc<=240)
            nb=noc*1.75f;
            else 
            nb=noc*2.25f;
        }else {
            if(noc<=50)
             nb=noc*20.50f;
            else if(noc<=120)
            nb=noc*65.75f;
            else if(noc<=240)
            nb=noc*110.50f;
            else 
            nb=noc*150.50f;
        }
        return nb;
    }
    public void display()
    {
        float nb=getBillAmount();        
        System.out.println("customer name="+cname);
        System.out.println("number of call made="+noc);
        System.out.println("net bill amount="+nb);
    }
    public static void main(String[]args){
        telephoneExchange t=new telephoneExchange();        
        t.acceptCalls();
        t.display();
    }
}
            