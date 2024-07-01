import java.util.*;
class CountWords
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String Words = new String(sc.nextLine());
        Words = Words.trim();
        Words =" "+Words;
        int nw =0;
        for(int i =0;i<Words.length();i++)
        {
            char ch = Words.charAt(i);
            if(Character.isWhitespace(ch))
            {
                nw++;
            }
        }
        System.out.println("Number of Words "+nw);
    }
}