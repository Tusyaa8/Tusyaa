import java.util.*;
class CountString
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word");
        String Word = new String(sc.nextLine());
        int cl=0,cd=0,csp=0;
        for(int i =0;i<Word.length();i++)
        {
            char ch = Word.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                if(Character.isLetter(ch))
                {
                    cl++;
                }
                else if(Character.isDigit(ch))
                {
                    cd++;
                }
            }
            else if(!Character.isWhitespace(ch))
            {
                csp++;
            }
        }
        System.out.println("Number of Letter "+cl);
        System.out.println("Number of Digit "+cd);
        System.out.println("Number of Special Characters " +csp);
    }
}