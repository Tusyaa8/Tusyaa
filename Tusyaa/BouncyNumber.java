import java.util.*;
class BouncyNumber
{
    static boolean key = false;
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int size  = String.valueOf(n).length();
        int a[][] = new int[3][size];
        for(int i =0;i<size;i++,n/=10)
        {
            int d = n%10;System.out.println(d);
            a[0][i]=d;a[1][i]=d;a[2][i]=d;
        }
        for(int i = 0;i<size-1;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                int nextPos = j+1;
                if(a[1][j]>a[1][nextPos])
                {
                    int t = a[1][j];
                    a[1][j]=a[1][nextPos];
                    a[1][nextPos] =t;
                }
                if(a[2][j]<a[2][nextPos])
                {
                    int t = a[2][j];
                    a[2][j]=a[2][nextPos];
                    a[2][nextPos] =t;
                }
            }
        }
        for(int i =0;i<size;i++)
        {
            //S//ystem.out.println(a[0][i]);
            if(a[0][i]!=a[1][i]&&a[0][i]!=a[2][i])
            {
                BouncyNumber.key=true;
            }
            //else
            //{
                //BouncyNumber.key = false;
            //}
        }
        if(key)
        {
            System.out.println("Bouncy Number");
        }
        else
        {
            System.out.println("Not Bouncy Number");
        }
    }
}