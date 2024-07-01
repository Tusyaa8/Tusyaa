import java.io.*;
class Palindrome
{
    private static int reverseDigit(int a)
    {
        int rev=0;
        while(a>0)
        {
            int r= a%10;
            rev= rev*10+r;
            a/=10;
        }
        return rev;
    }//ReverseDigit Function
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a Number");
        int n = Integer.parseInt(in.readLine());
        if(Palindrome.reverseDigit(n)==n)
        {
            System.out.println("A Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }//Main Function
}//Class