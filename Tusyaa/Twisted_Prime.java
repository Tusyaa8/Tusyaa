import java.util.*;
class Twisted_Prime
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Prime Number");
        int pm = sc.nextInt();
        int r,rev=0,c=0;
        while(pm>0)
        {
            r = pm % 10;
            rev = rev * 10 + r;
            pm = pm / 10;
        }
        for(int i =1;i<=rev;i++)
        {
            if(rev%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("Twisted Prime Number");
        }
        else
        {
            System.out.println("Not Twisted Prime Number");
        }
    }
}