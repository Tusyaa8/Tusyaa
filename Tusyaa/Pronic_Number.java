import java.io.*;
class Pronic_Number
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a Number");
        int n = Integer.parseInt(in.readLine());
        boolean pn = false;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0&&i*(i+1)==n)
            {
                pn = true;
                break;
            }
            else
            {
                pn = false;
            }
        }
        if(pn==true)
        {
            System.out.println("Pronic Number");
        }
        else
        {
            System.out.println("Not Pronic Number");
        }
    }
}