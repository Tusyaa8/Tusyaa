class Pattern_2
{
    public static void main()
    {
        String word = "COMPUTER";
        for(int i = word.length();i>=0;i--)
        {
            System.out.println(word.substring(0,i));
        }
    }
}