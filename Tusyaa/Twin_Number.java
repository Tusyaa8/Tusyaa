import java.util.*;
class Twin_Number
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i,c1=0,c2=0,Difference=0;
        for(i=1;i<=n1;i++)
        {
            if(n1%i==0)
            {
                c1++;
            }
        }
        for(i=1;i<=n2;i++)
        {
            if(n2%i==0)
            {
                c2++;
            }
        }
        if(c1==2&&c2==2)
        {
            Difference = n1-n2;
        }
        if(Difference==2||Difference==-2)
        {
            System.out.println("Twin Number");
        }
        else
        {
            System.out.println(" Not Twin Number");
        }
    }
}