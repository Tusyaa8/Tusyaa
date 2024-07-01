import java.io.*;
class ToggleCase
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter Sentence ");
        String word = new String(in.readLine());
        String newWord = new String();
        for(int i =0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                ch = Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch))
            {
                ch = Character.toUpperCase(ch);
            }
            newWord+=ch;
        }
        System.out.println("Toggle Case");
        System.out.println(newWord);
    }
}