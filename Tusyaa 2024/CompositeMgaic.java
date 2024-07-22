import java.util.*;
class CompositeMgaic
{
    public static void main()
    {
        CompositeMgaic ob = new CompositeMgaic();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();
        if(ob.isCompositeMagic(n))
        {
            System.out.println(n+" Is Composite Magic Number");
        }
        else
        {
            System.out.println(n+" Is NOT Composite Magic Number");
        }
    }
    boolean isCompositeMagic(int n)
    {
        if(n>0)
        {   
            if(isMagic(n)&&isComposite(n))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    boolean isMagic(int n)
    {
        int sum =n;
        while(n>9)
        {   
            sum =0;
            while(n>0)
            {
                int r = n%10;
                sum+=r;
                n/=10;
            }
            n = sum;
        }
        if(n==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isComposite(int n)
    {
        int count =0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count>2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}