class Overload
{
    static String s="COMPUTER";
    public static void main()
    {
        Overload ob = new Overload();
        ob.check(s);System.out.println();//New Line feed
        ob.check(s,'P');
    }//main method
    void check(String str,char ch)
    {
        int c=0;
        for(int i =0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                c++;
            }
        }
        System.out.println("Number of '"+ch+"' present in String is "+c);
    }
    void check(String str)
    {
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if("aeiou".indexOf(str.charAt(i))!=-1)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}//class