import java.util.*;
class HappyNumber
{
        int n,m;//data members
    public static void main()
    {
        HappyNumber ob = new HappyNumber();
        ob.input();
        ob.generateHappyNumber();
    }//main Method
    boolean isHappyNumber(int n)
    {
        boolean sw = false;
        n=(n<9)?n*n:n;
        while(n>9)
        {
            int count = (n+"").length();
            int sum =0;
            for(int i=1;i<=count;i++)
            {
                int r = n%10;
                n/=10;
                sum+=(int)(Math.pow(r,2));
            }
            n = sum;
        }
        sw =(n==1)?true:false;
        return sw;
    }//isHappy
    void generateHappyNumber()
    {
        int count =0;
        for(int i=n;i<=m;i++)
        {
            if(isHappyNumber(i))
            {
                count++;
                if(count==1)
                {
                    System.out.println("Happy Numbers From "+n+" to "+m+" Are");
                }
                System.out.println(i);
            }
        }
        if(count==0)
        {
            System.out.println("There Are NO Happy Numbers From "+n+" to "+m);
        }
    }//generateMethod
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Range");
        System.out.println("N to M");
        System.out.println("N");
        n = sc.nextInt();
        System.out.println("M");
        m = sc.nextInt();
    }//inputMethod
}//class