import java.io.*;
class Special_Number
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a Two Digit Number");
        int n = Integer.parseInt(in.readLine());
        int r,s=0,p=1,ps=0,m=n;
        while(n>0)
        {
            r = n%10;
            s = s +r;
            p = p*r;
            n = n/10;
        }
        ps = s+p;
        if(ps==m)
        {
            System.out.println("Special two digit Number");
        }
        else
        {
            System.out.println("Not a Special two digit Number");
        }
    }
}