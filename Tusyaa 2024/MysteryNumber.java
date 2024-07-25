import java.util.Scanner;
class MysteryNumber
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        MysteryNumber ob = new MysteryNumber();
        System.out.println("Enter A Number ");
        int n = sc.nextInt();
        if(ob.isMystery(n))
        {
            System.out.println(n+" Is A Mystery Number");
        }
        else
        {
            System.out.println(n+" Is NOT A Mystery Number");
        }
    }//Main Method
    boolean isMystery(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if((i+reverse(i))==n)
            {
                return true;
            }
        }
        return false;
    }//MysteryNumber
    int reverse(int n)
    {
        int rev =0;
        while(n>0)
        {
            int r = n%10;
            rev=(rev*10)+r;
            n/=10;
        }
        return rev;
    }//ReverseNumber
}//class