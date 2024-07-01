import java.util.*;
class seris7
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        double s,d =0.0;
        int i;
        System.out.println("Enter N");
        int n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s = 1/Math.pow(a,i);
            d = d + s;
        }
        System.out.println(d);
    }
}