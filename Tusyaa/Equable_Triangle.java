import java.util.*;
class Equable_Triangle
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THREE SIDES OF A TRIANGLE TO CHECK WHETEHER IT EQUABLE");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int peri,area,s,p;
        p=a+b+c;
        s=p/2;
        area=s*(s-a)*(s-b)*(s-c);
        peri=p*p;
        if(peri==area)
        {
            System.out.println("Equable Triangle");
        }
        else
        {
            System.out.println("Not Equable Triangle");
        }
    }
}
