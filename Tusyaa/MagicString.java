import java.util.*;
class MagicString
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        MagicString obj = new MagicString();
        System.out.println("Enter A Word");
        String s = sc.next();
        if(obj.magic(s))
        {
            System.out.println("It is a Magic String");
        }
        else
        {
            System.out.println("Not a Magic String");
        }
    }
    private boolean magic(String s)
    {
        s = s.toLowerCase();boolean is = false;
        for(int i =0;i<s.length()-1;i++)
        {
            char ch = s.charAt(i);++ch;
            if(ch==s.charAt(i+1))
            {
                is = true;break;
            }
        }
        if(is)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}