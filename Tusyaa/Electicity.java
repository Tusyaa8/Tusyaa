import java.util.*;
class Electicity
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");
        String s = sc.nextLine();
        System.out.println("Consumer's Number");
        double d =sc.nextDouble();
        System.out.println("ENTER UNITS COSUMED");
        int u = sc.nextInt();
        double amt;
        if(u<=100)
        {
            amt=5.50*100;
        }
        else if(u<=300)
        {
            amt=(u-100)*6.50+550;
        }
        else if(u<=600)
        {
            amt=(u-300)*7.50+550+1300;
        }
        else
        {
            amt=(u-600)*8.50+550+1300+2250;
        }
        System.out.println(amt);
    }
}
