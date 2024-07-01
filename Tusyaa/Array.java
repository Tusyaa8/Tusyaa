import java.util.*;
class Array
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elements");
        double a[][] = new double[2][2];
        for(int r =0;r<a.length;r++)
        {
            for(int c =0;c<a[0].length;c++)
            {
                a[r][c] = sc.nextDouble();
                if(a[r][c]>=1)
                {
                    System.out.println("Enter Below 1");
                    System.exit(0);
                }
            }
        }
        int sr=0,s=0;
        for(int r =0;r<a.length;r++)
        {
            for(int c =0;c<a[0].length;c++)
            {
                sr+=a[r][c];
                s+=a[c][r];
                if(sr==1&&s==1)
                {
                    System.out.println(a[r][c]);
                }
                else
                {
                    System.out.println(0);
                }
            }
            s=0;sr=0;
        }
    }
}