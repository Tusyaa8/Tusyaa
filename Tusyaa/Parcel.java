import java.util.*;
class Parcel
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE AMOUNT OF GRAMS");
        int gram = sc.nextInt();
        double amt = 0;
        double f;
        f = gram/100;
        if(f==(int)f)
        {
            f = f-1;
            amt = 50 +(f*20);
        }
        else
        {
            f = (int)f;
            amt = 50 + (f*20);
        }
        System.out.println("The amount is " + amt);
    }
}












































