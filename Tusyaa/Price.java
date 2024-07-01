import java.util.*;
class Price
{
    public static void main()
    {
        System.out.println("ENTER SELLING PRICE");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println("ENTER THE COST PRICE");
        int c=sc.nextInt();
        int d;int t;int a;
        if(s>c)
        {
            t=s-c;
            System.out.println("THE PROFIT IS "+t);
            d=t*100;
            a=d/c;
            System.out.println("THE PROFIT PERCENTAGE IS "+a);
        }
        else if(s<c)
        {
            t=c-s;
            System.out.println("THE LOSS IS "+t);
            d=t*100;
            a=d/c;
            System.out.println("THE LOSS PERCENTAGE IS "+a);
        }
        else if(s==c)
        {
            System.out.println("NEITHER PROFIT NOR LOSS");
        }
        }
    }