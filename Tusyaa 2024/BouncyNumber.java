import java.util.Scanner;
class BouncyNumber
{
    long n;
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        BouncyNumber ob = new BouncyNumber();
        System.out.println("Enter A Number ");
        ob.n = sc.nextLong();
        if(ob.isBouncy())
        {
            System.out.println(ob.n+ " Is A Bouncy Number");
        }
        else
        {
            System.out.println(ob.n+ " Is NOT A Bouncy Number");
        }
    }//Main Function
    boolean isBouncy()
    {
        String s= String.valueOf(this.n);
        boolean inc = true,dec = true;
        for(int i=0;i<s.length()-1;i++)
        {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch<=ch2)
            {
                continue;
            }
            inc = false;
        }
        for(int i=0;i<s.length()-1;i++)
        {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch>=ch2)
            {
                continue;
            }
            dec = false;
        }
        return (dec||inc)?false:true;
    }//isBouncy
}//class