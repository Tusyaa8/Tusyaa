import java.util.Scanner;
class XylemNumber
{
    static boolean isXylemNumber(int n)
    {
        int m =n;int sumMean =0;
        int sumExtereme =0;
        while(n>0)
        {
            int r = n%10;
            if(n==m||n<=9)
            {
                sumExtereme+=r;
            }
            else
            {
                sumMean+=r;
            }
            n/=10;
        }
        if(sumExtereme==sumMean)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number ");
        int n = sc.nextInt();
        if(isXylemNumber(n))
        {
            System.out.println(n+" Is A Xylem Number");
        }
        else
        {
            System.out.println(n+" Is NOT A Xylem Number");
        }
    }
}