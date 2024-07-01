import java.util.*;
class UpperMatrix
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N \"Row Column\"");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter Matrix");
        for(int r = 0;r<a.length;r++)
        {
            for(int c=0;c<a[0].length;c++)
            {
                a[r][c] = sc.nextInt();
            }
        }
        for(int r=0;r<a.length;r++)
        {
            for(int c=0;c<a[0].length;c++)
            {
                System.out.print(a[r][c]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        boolean zero = true;
        boolean Nonzero = true;
        for(int r = 0;r<a.length;r++)
        {
            for(int c=0;c<a[0].length;c++)
            {
                if(r<=c&&a[r][c]==0)
                {
                    Nonzero = false;
                    break;
                }
                if(r>c&&a[r][c]!=0)
                {
                    zero = false;
                    break;
                }
            }
        }
        if(zero&&Nonzero)
        {
            System.out.println("Upper Triangular Matrix");
        }
        else
        {
            System.out.println("Not Upper Triangular Matrix");
        }
    }
}