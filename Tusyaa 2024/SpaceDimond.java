class SpaceDimond
{//pg 228 program (j)
    public static void main()
    {
        for(int i=1;i<=9;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=4,t=6,s=1;i>=1;i--,t++,s+=2)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=1;j<=s;j++)
            {
                System.out.print("  ");//2 space
            }
            for(int j=i,k=t;j>=1;j--,k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }//outer loop
        for(int i=2,s=5,t=8;i<=4;i++,s-=2,t--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=1;j<=s;j++)
            {
                System.out.print("  ");//2 space
            }
            for(int j=t;j<=9;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }//outer loop
        for(int i=1;i<=9;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }//MainFunciton
}//class