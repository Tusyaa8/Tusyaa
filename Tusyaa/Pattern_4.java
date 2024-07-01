class Pattern_4
{
    public static void main()
    {
        String s ="BLUEJ";int t=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(s.charAt(t)+" ");
            }
            t++;System.out.println();
        }
    }
}