import java.util.*;
class TransposeMatrix
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        int a[][] =new int [n][n];
        int b[][] =new int [n][n];
        System.out.println("Enter Matrix");
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
                b[r][c] = a[c][r];
            }
            System.out.println();
        }
        for(int r = 0;r<b.length;r++)
        {
            for(int c = 0;c<a[0].length;c++)
            {
                System.out.print(b[r][c]+" ");
            }
            System.out.println();
        }
    }
}