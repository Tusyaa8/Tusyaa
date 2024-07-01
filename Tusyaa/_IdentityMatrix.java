import java.util.*;
class _IdentityMatrix//School Logic
{
    public static void main()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N for Matrix(row and Column)");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for(int r = 0;r<a.length;r++)
        {
            for(int c = 0;c<a[0].length;c++)
            {
                a[r][c] = sc.nextInt();
            }
        }
        System.out.println();
        for(int r = 0;r<a.length;r++)
        {
            for(int c = 0;c<a[0].length;c++)
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println();
        boolean Diaginol = true;
        boolean other = true;
        for(int r =0;r<a.length;r++)
        {
            for(int c=0;c<a[0].length;c++)
            {
                if(r==c&&a[r][c]!=1)
                {
                    Diaginol = false;
                    break;
                }
                if(r!=c&&a[r][c]!=0)
                {
                    other = false;
                    break;
                }
            }
        }
        if(Diaginol&&other)
        {
            System.out.println("Identity Matrix");
        }
        else
        {
            System.out.println("Not an Identity Matrix");
        }
     }
}