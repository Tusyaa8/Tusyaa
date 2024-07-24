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
        for(long i =1;i<=100;i++)
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
        System.out.println("Enter The Range");
        System.out.println("From N to M");
        System.out.println("N ");
        n = sc.nextInt();
        System.out.println("M ");
        m = sc.nextInt();
    }//Input Method
    void generateLychrelNumber()
    {
        int count =0;
        for(int i =n;i<=m;i++)
        {
            if(isLychrel(i))
            {
                count++;
                if(count==1)
                {
                    System.out.println("Lychrel Numbers Are");
                }
                System.out.println(i);
            }
        }
        if(count==0)
        {
            System.out.println("There Are No Lychrel Numbers Within The Given Range");
        }
    }//Generate Method
    public static void main()
    {
        LychrelNumber ob = new LychrelNumber();
        ob.input();
        ob.generateLychrelNumber();
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