import java.util.Scanner;
class PronicNumber
{
    static boolean isPronic(int n)
    {
        boolean isPronic = false;
        for(int i=1;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                isPronic = true;
                break;
            }
        }
        return isPronic;
    }//isPronic
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number ");
        int n = sc.nextInt();
        if(PronicNumber.isPronic(n))
        {
            System.out.println(n+" The Number is A Pronic Number");
        }
        else
        {
            System.out.println(n+" The Number is NOT A Pronic Number");
        }
    }//Main Function
}//class