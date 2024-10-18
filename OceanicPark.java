import java.util.Scanner;
class OceanicPark{
    private int norides;int nopersons;
    public OceanicPark()
    {
        norides=nopersons=0;
    }
    public OceanicPark(int x,int y)
    {
        norides=x;
        nopersons=y;
    }
    public void takeDetails()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("entre number of rides booked");
        norides=sc.nextInt();
        System.out.println("enter number of persons");
        nopersons=sc.nextInt();
    }
    public float getFull()
    {
        float ad,ai,rn;
        if(norides<=5)
        rn=norides*30;
        else if(norides<=10)
        rn=150+(norides-5)*25;
        else if(norides<=20)
        rn=150+125+(norides-10)*20;
        else
        rn=150+125+200+(norides-20)*18;
        ad=nopersons*rn;
        ai=ad*69;
        return ai;
    }
    public void showDetails()
    {
        float ai=getFull();
         System.out.println("entre number of rides booked="+ norides);
         System.out.println("enter number if persons="+nopersons);
        System.out.println("full fare="+ai);
    }
    public static void main(String[]args){
        OceanicPark p= new OceanicPark();
        p.takeDetails();
        p.showDetails();
      }
}