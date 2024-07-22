class NumberDiamond
{//pg 228 program(d)
    public static void main()
    {
        for(int i =4,k=1;i>=1;i--,k++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=k;j++)
            {
                System.out.print(k+" ");
            }
            System.out.println();//New Line
        }//outerLoop
        for(int i=1;i<=5;i++)
        {
            System.out.print("5 ");
        }
        System.out.println();//NewLine
        for(int i=1,k=4;i<=4;i++,k--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=4;j>=i;j--)
            {
                System.out.print(k+" ");
            }
            System.out.println();//NewLine
        }//outerLoop
    }//Main Method
}//Class