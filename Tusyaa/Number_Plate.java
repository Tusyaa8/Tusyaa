class Number_Plate
{
    public static void main()
    {
        int count = 0;
        char a = 'A';
        char b = 'A';
        for (int i=1; i<=26;i++)
        {
            b='A';
            System.out.println();//New line feed
            System.out.println(a+" Series");
            for(int j=1; j<=26;j++)
            {
                System.out.println("TN58"+a+b+"6233");
                b++;count++;
            }
            a++;
        }
        System.out.println("All Possible Numbers "+count);
    }
}