import java.util.*;
class Case
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentance");
        String word = new String(sc.nextLine());
        String newWord  = new String();
        word.toLowerCase();
        for(int i =0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if("aeiou".indexOf(ch)!=-1)
            {
                ch = '*';
            }
            newWord+=ch;
        }
        System.out.println(newWord);
    }
}