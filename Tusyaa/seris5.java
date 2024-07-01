import java.util.*;
class seris5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        double s=1.0,d =0.0;
        int i;
        System.out.println("Enter N");
        int n = sc.nextInt();
        int t =2;
        for(i=1;i<=n;i++)
        {
            d = d + s;
            s = Math.pow(t,t)/Math.pow(a,i);
            t++;
        }
        System.out.println(d);
    }
}