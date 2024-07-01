// upto 200units
import java.util.*;
class Tn_house_bill
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Units Consumed");
        int u = sc.nextInt();
        double amt=0.0;
         if (u<=200)
        {
           amt=(u-100)*2.50; 
        }
        System.out.println(amt);
    }
}