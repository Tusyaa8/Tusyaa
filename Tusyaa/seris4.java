import java.util.*;
class seris4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        double s,d =0.0;
        int i;
        System.out.println("Enter Power Value");
        int n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s = Math.pow(a,i);
            d = d+s;
        }
        System.out.println(d);
    }
}