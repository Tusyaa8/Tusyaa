import java.util.*;
class seris2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        double s,d=0.0;
        int i;
        for(i =1;i<=10;i++)
        {
            s = Math.pow(a,i)/i;
            d = d + s;
        }
        System.out.println(d);
    }
}