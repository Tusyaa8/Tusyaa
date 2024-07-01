import java.util.*;
class seris3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        double s,d =0.0;
        int i;
        for(i=2;i<=20;i++)
        {
            s = a * i;
            d = d +s;
        }
        System.out.println(d);
    }
}