import java.util.*;
class Buzz
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P");
        int p = sc.nextInt();
        System.out.println("Enter Q");
        int q = sc.nextInt();
        for(int i = p;i<=q;i++)
        {
             if(i%7==0)
             {
                 System.out.println("Buzz"+i);
             }
             else if(i%10==7)
             {
                 System.out.println("Buzz"+i);
             }
        }
    }
}