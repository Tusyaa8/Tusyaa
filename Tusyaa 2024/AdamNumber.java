import java.util.*;
class AdamNumber
{
    int n,m;//data members
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Range ");
        System.out.println("N to M");
        System.out.println("N");
        n =sc.nextInt();
        System.out.println("M");
        m =sc.nextInt();
    }//input Method
    int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            int r = n%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev;
    }//reverse Method
    int square(int n)
    {
        int sq =0;
        sq = (int)(Math.pow(n,2));
        return sq;
    }//square Method
    public static void main()
    {
        AdamNumber ob = new AdamNumber();
        ob.input();int count =0;
        for(int i=ob.n;i<=ob.m;i++)
        {
            if(ob.isAdamNumber(i))
            {
                count++;
                if(count==1)
                {
                    System.out.println("Adam Numbers From "+ob.n+" to "+ob.m);
                }
                System.out.println(i);
            }
        }
        if(count==0)
        {
            System.out.println("There Are No Adam Numbers From "+ob.n+" to "+ob.m);
        }
    }//Main Method
    boolean isAdamNumber(int n)
    {
        if(square(n)==reverse(square(reverse(n))))
        {
            return true;
        }
        else
        {
            return false;
        }
    }//is Adam
}//class