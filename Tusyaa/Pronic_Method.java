import java.io.*;
class Pronic_Method
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        Pronic_Method obj = new Pronic_Method();
        System.out.println("Enter a Number");
        int n = Integer.parseInt(in.readLine());
        if(obj.pronic(n)==1)
        {
            System.out.println("Pronic Number");
        }
        else
        {
            System.out.println("Not A Pronic Number");
        }
    }//Main Function
    private int pronic(int n)
    {
        boolean sw =false;
        for(int i = 1;i<=n;i++)
        {
            if(n%i==0&&n%(i+1)==0)
            {
                sw = true;break;
            }
        }
        if(sw)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }//Pronic Function
}