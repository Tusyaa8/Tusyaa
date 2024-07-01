import java.util.*;
class Sentence
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String s = sc.nextLine().trim();
        s=" "+s;s=s.toLowerCase();
        String result="";
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isWhitespace(ch))
            {
                ch = Character.toUpperCase(s.charAt(++i));
                result+=" " + ch;
            }
            else
            {
                result+=ch;
            }
        }
        System.out.println(result.trim());
    }
}