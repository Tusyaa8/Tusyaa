// page 231
import java.util.*;
class seris1
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();
        double s = 0.0,d=0.0;
        int i;
        for (i=1;i<=10;i++)
        {
            s = Math.pow(a,2)/i;
            d = d+s;
        }
        System.out.println(d);
    }
}