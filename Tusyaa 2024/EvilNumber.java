import java.util.*;
class EvilNumber
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();
        if(EvilNumber.isEvil(n))
        {
            System.out.println(n+ " Is An Evil Number");
        }
        else
        {
            System.out.println(n+" Is NOT An Evil Number");
        }
    }//Main Method
    static boolean isEvil(int n)
    {
        int count =0;
        while(n>0)
        {
            int r = n%2;
            if(r==1)
            {
                count++;
            }
            n/=2;
        }
        return (count%2==0&&count!=0);
    }//Is Evil
}//class