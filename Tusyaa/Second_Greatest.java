import java.util.*;
class Second_Greatest
{
    public static void main()
    {
        System.out.println("ENTER THREE VALUE FOR A B C");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER VALUE FOR A");
        int a=sc.nextInt();
        System.out.println("ENTER VALUE FOR B");
        int b=sc.nextInt();
        System.out.println("ENTER VALUE FOR C");
        int c=sc.nextInt();
        if(a>b&&a<c||a>c&&a<b)
        {
            System.out.println("A IS THE SECOND GREATEST NUMBER "+a);
        }
        else if(b>a&&b<c||b>c&&b<a)
        {
            System.out.println("B IS THE SECOND GREATEST NUMBER "+b);
        }
        else
        {
            System.out.println("C IS THE SECOND GREATEST NUMBER "+c);
        }
    }
}