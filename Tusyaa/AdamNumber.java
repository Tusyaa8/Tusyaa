import java.util.*;
class AdamNumber
{
    public static void main()
    {
        System.out.println('*'* 10);
        AdamNumber ob = new AdamNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();int copy = n;//Copy of N
        int m = ob.reverse(n);//Reversed the Input Number
        int t = ob.reverse((copy));//Reversed the Square Number
        if(t==m)
        {
            System.out.println("Adam Number");
        }
        else
        {
            System.out.println("Not An Adam Number");
        }
    }
    int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            int r = n%10;
            rev = (rev*10)+r;
            n/=10;
        }
        return rev;
    }
}
