class InvertedPatten
{
    public static void main()
    {
        for(int i=1;i<=7;i++)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
        for(int i=1,k=5,l=2;i<=3;i++,k-=2,l++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("\t");
            }
            for(int j=1,t=l;j<=k;j++)
            {
                System.out.print("\t");
                System.out.print(t++);
            }
            System.out.println();
        }
    }
}