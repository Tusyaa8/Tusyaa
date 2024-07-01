import java.io.*;
class Menu_Number
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the Number");
        int n = Integer.parseInt(in.readLine());
        System.out.println("Enter 1 for Palindrome 2 for Perfect Number");
        char ch = (char)(in.read());
        int r,rev=0,d;
        int m = n;
        switch(ch)
        {
            case '1':
                while(n>0)
                {
                    r=n%10;
                    rev=rev*10+r;
                    n=n/10;
                }
                if(m==rev)
                {
                    System.out.println("Palindrome");
                }
                else
                {
                    System.out.println("Not Palindrome");
                }
                break;
            case '2':
                for(int i =1;i<n;i++)
                {
                    if(n%i==0)
                    {
                        rev = rev +i;
                    }
                }
                if(n==rev)
                {
                    System.out.println("Perfect Number");
                }
                else 
                {
                    System.out.println("Not Perfect Number");
                }
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}