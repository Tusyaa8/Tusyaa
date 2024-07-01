import java.util.*;
class IdentityMatrix
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
        int i = a.length-1,zero=0;
         for(int r = 0;r<a.length;r++)
        {
            for(int c = 0;c<a[0].length;c++)
            {
                while(i>=0)
                {
                    if(a[i][i]==1)
                    {
                        --i;
                    }
                    else
                    {
                        i=-10;
                    }
                }
                if(a[r][c]==0)
                {
                    zero++;
                }
            }
        }
        if(((i+1)==0)&&((a.length*a[0].length)==zero+n))
        {
            System.out.println("Identity Matrix");
        }
        else
        {
            System.out.println("Not an Identity Matrix");
        }
    }//Main Function
}//Class