import java.util.*;
class WordProgram
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Words");
        String word = new String(sc.nextLine());
        word.toLowerCase();
        int countOfVowels=0,
        countOfConsonant=0,
        countOfWhitespace=0;
        for(int i =0;i<word.length();i++)
        {
            if(Character.isLetter(word.charAt(i)))
            {
                if(("aeiou".indexOf(word.charAt(i)))!=-1)
                {
                    countOfVowels++;
                }
                else
                {
                    countOfConsonant++;
                }
            }
            else if(Character.isWhitespace(word.charAt(i)))
            {
                countOfWhitespace++;
            }
        }
        System.out.println("Number of Letters " +word.length()+"\n");
        System.out.println("Number of Vowels " +countOfVowels+"\n");
        System.out.println("Number of Consonant " +countOfConsonant+"\n");
        System.out.println("Number of White Space " +countOfWhitespace);
    }
}