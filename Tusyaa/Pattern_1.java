class Pattern_1
{
    public static void SchoolLogic()
    {
        System.out.println("School Logic");
        String word = new String("ICSE");
        for(int i =1;i<=word.length();i++)
        {
            System.out.println(word.substring(0,i));
        }
    }
    public static void MyLogic()
    {
        System.out.println("My Logic");
        String word = new String("ICSE");
        for(int i = 0;i<word.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}