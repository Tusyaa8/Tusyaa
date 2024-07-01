import java.io.*;
class Identity_Matrix
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a[][] = new int [3][3];
        for(int r = 0;r<a.length;r++)
        {
            for(int c = 0;c<a[0].length;c++)
            {
                a[r][c] = Integer.parseInt(in.readLine());//User Input
            }
        }
        for(int r = 0;r<a.length;r++)
        {
            for(int c = 0;c<a[0].length;c++)
            {
                System.out.print(a[r][c]+" ");//Printing the Matrix
            }
            System.out.println();
        }
        System.out.println();
        int i = 0,zero = 0;
        for(int r = 0;r<a.length;r++)
        {
            for(int c = 0;c<a[0].length;c++)
            {
                if(a[i][i]==1&&a[i+1][i+1]==1&&a[i+2][i+2]==1)
                {
                    if(a[r][c]==0)
                    {
                        zero++;
                    }
                }
            }
        }
        if(zero+3==(a.length*a[0].length))
        {
            System.out.println("Identity\n"+"Matrix");
        }
        else
        {
            System.out.println("Not an Identity Matrix!");
        }
    }//Main Function
}//class