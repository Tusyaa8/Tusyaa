import java.util.*;
class CircularPrime
{
    boolean isPrime(String s)
    {
        int n = Integer.valueOf(s);
        boolean sw = false;int count =0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        sw = (count==2)?true:false;
        return sw;
    }//is Prime
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        CircularPrime ob = new CircularPrime();
        System.out.println("Enter A Number ");
        String n =sc.next();
        int c = n.length(); boolean sw = true;
        for(int i=1;i<=c;i++)
        {
            if(!ob.isPrime(n))
            {
                sw = false;
            }
            n = n.substring(1)+n.charAt(0);
        }
        if(sw)
        {
            System.out.println("The Number is a Cirular Prime");
        }
        else
        {
            System.out.println("The Number is NOT a Cirular Prime");
        }
    }//Main Funciton
}//class