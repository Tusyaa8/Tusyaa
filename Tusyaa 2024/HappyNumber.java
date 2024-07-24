import java.util.*;
class HappyNumber
{
    int n;
    public static void main()
    {
        HappyNumber ob = new HappyNumber();
        int m = ob.input();
        if(ob.isHappyNumber())
        {
            System.out.println(m+" Happy Number");
        }
        else
        {
            System.out.println(m+" NOT A Happy Number");
        }
    }//main Method
    boolean isHappyNumber()
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
    int input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        n = sc.nextInt();
        return n;
    }//inputMethod
}//class