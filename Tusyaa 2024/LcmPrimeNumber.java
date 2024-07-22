import java.util.*;
class LcmPrimeNumber
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers ");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int lcm = 1; int i =2;
        while(n!=1||n2!=1)
        {
            if(n%i==0&&n2%i==0)
            {
                lcm*=i;
                n/=i;n2/=i;
            }
            else if(n%i==0)
            {
                lcm*=i;
                n/=i;
            }
            else if(n2%i==0)
            {
                lcm*=i;
                n2/=i;
            }
            else
            {
                i++;
            }
        }
        System.out.println("Lcm of the Numbers is " + lcm);
    }//Main Function
}//class