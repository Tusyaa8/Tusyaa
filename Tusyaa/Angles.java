import java.util.*;
class Angles
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter c for Complementary or s for Supplementary(Lower case)");
        char ch = sc.next().charAt(0);
        System.out.println("Enter Two Angles");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=0;
        switch(ch)
        {
            case 's':
                c = a+b;
                if(c==180)
        {
            System.out.println("Supplementary");
        }
        else 
        {
            System.out.println("Not Supplementary");
        }
                break;
            case 'c':
                c = a+b;
                if (c==90)
        {
            System.out.println("Complementary");
        }
        else if(c!=90)
        {
             System.out.println("Not Complementary");
        }
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}