import java.util.*;
class seris8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        int x = sc.nextInt();
        double s,d =0.0;
        int i;
        for(i=2;i<=20;i+=3)
        {
            s = x/i;
            d = d + s;
        }
        System.out.println(d);
    }
}