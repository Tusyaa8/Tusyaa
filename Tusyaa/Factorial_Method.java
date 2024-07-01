import java.util.*;
class Factorial_Method
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Factorial_Method obj = new Factorial_Method();
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println(obj.fact(n));
    }
    private int fact(int n)
    {
        int f=1;
        for(int i =1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
}