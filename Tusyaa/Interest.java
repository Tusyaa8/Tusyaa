import java.util.*;
class Interest
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int si;
        System.out.println("Principal");
        int p = sc.nextInt();
        System.out.println("Rate");
        int r = sc.nextInt();
        System.out.println("Time");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            si = (p*r*n)/100;
            p = p + si;
        }
        System.out.println(p);
    }
}