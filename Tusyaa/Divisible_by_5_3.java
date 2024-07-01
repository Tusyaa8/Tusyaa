import java.util.*;
class Divisible_by_5_3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int a=sc.nextInt();
        if(a%5==0||a%3==0)
        {
            if(a%5==0&&a%3!=0)
            {
                System.out.println("THIS NUMBER IS DIVISIBLE BY 5");
            }
            else if(a%5!=0&&a%3==0)
            {
                System.out.println("THIS NUMBER IS DIVISIBLE BY 3");
            }
        }
        else if(a%5!=0&&a%3!=0)
        {
            System.out.println("THIS NUMBER IS NEITHER DIVISIBLE BY 3 NOR BY 5");
        }
    }
}