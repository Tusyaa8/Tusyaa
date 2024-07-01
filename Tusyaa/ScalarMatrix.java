import java.io.*;
class ScalarMatrix
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter N for Matrix(row and Column)");
        int n = Integer.parseInt(in.readLine());
        int array[][] = new int [n][n];
        for(int r = 0;r<array.length;r++)
        {
            for(int c = 0;c<array[0].length;c++)
            {
                array[r][c] = Integer.parseInt(in.readLine());
            }
        }
        System.out.println();
        for(int r = 0;r<array.length;r++)
        {
            for(int c =0;c<array[0].length;c++)
            {
                System.out.print(array[r][c]+" ");
            }
            System.out.println();
        }
        int Scalar = array[0][0];
        int i = array.length-1;
        int zero = 0;
        for(int r = 0;r<array.length;r++)
        {
            for(int c =0;c<array[0].length;c++)
            {
                while(i>=0)
                {
                    if(array[i][i]==Scalar)
                    {
                      --i;
                    }
                    else 
                    {
                        i =-10;
                    }
                }
                if(array[r][c]==0)
                {
                    zero++;
                }
            }
        }
        System.out.println();
        if((i+1==0)&&(array.length*array[0].length)==(zero+n))
        {
            System.out.println("Scalar Matrix");
        }
        else
        {
            System.out.println("Not a Scalar Matrix");
        }
    }//Main Function
}//class