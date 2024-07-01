import java.util.*;
class Count
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word");
        String Word = new String(sc.nextLine());
        int uc=0,lc=0,ws=0;
        for(int i =0;i<Word.length();i++)
        {
            char ch = Word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                uc++;
            }
            else if(Character.isLowerCase(ch))
            {
                lc++;
            }
            
            else if(Character.isWhitespace(ch))
            {
                ws++;
            }
        }
        System.out.println("Number of UpperCase "+uc);
        System.out.println("Number of LowerCase "+lc);
        System.out.println("Number of WhiteSpace " +ws);
    }
}