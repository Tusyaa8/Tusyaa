//A PROGRAM IN BOOK PAGE 178 3rd 
import java.util.*;
class Equal
{
    public static void main ()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER 3 NUMBERS");
        System.out.println("ENTER VALUE FOR A");
        int a=sc.nextInt();
        System.out.println("ENTER VALUE FOR B");
        int b=sc.nextInt();
        System.out.println("ENTER VALUE FOR C");
        int c=sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("A VALUE IS GREATER " +a);
        }
        else if(b>a&&b>c)
        {
            System.out.println("B VALUE IS GREATER "+b);
        }
        else if(c>a&&c>b)
        {
            System.out.println("C VALUE IS GREATER "+c);
        }
        else if(a==b&&b==c)
        {
            System.out.println("ALL NUMBERS ARE EQUAL");
        }
    }
}