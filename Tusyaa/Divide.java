// A PROGRAM BY TUSYAA
import java.util.*;
class Divide
{
    public static void main ()
    {
       System.out.println("ENTER A NUMBER");
       Scanner Sc = new Scanner (System.in);
       int a = Sc.nextInt();
       int d;
       d=a%7;
       if(d==0)
       {
          System.out.println("THIS NUMBER CAN BE DIVISABLE BY 7");   
       }
       else
       {
           System.out.println("THIS NUMBER CAN NOT BE DIVISABLE BY 7");
       }
    }
}