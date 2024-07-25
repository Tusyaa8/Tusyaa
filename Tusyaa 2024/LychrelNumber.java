import java.util.*;
class LychrelNumber
{
    int n,m;//data Members
    LychrelNumber()
    {
        n =0;m=0;
    }//Constructer
    boolean isLychrel(long n)
    {
        boolean isLychrel = true;;
        long sum=0;
        for(long i =1;i<=this.m;i++)
        {
            sum =add(n,reverse(n));
            if(sum==reverse(sum))
            {
                isLychrel = false;
                break;
            }
            n=sum;
        }
        return isLychrel;
    }//Is Lychrel Method
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number ");
        n = sc.nextInt();
        System.out.println("Enter No of Cycles ");
        m = sc.nextInt();
    }//Input Method
    public static void main()
    {
        LychrelNumber ob = new LychrelNumber();
        ob.input();
        if(ob.isLychrel(ob.n))
        {
            System.out.println("The Number Is A Lychrel Number");
        }
        else
        {
            System.out.println("The Number Is NOT A Lychrel Number");
        }
    }//Main Method
    long reverse(long n)
    {
        long rev =0;
        while(n>0)
        {
            long r = n%10;
            rev = (rev*10)+r;
            n/=10;
        }
        return rev;
    }//Reverse Method
    long add(long n, long m)
    {
        long sum = 0;
        sum = n+m;
        return sum;
    }//Add Method
}//class