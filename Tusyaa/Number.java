class Number
{
    void display(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println('*');
        }
    }
    void display(int m,int n)
    {
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<n;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    void display(char ch)
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<5;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Number ob = new Number();
        ob.display(100);
        ob.display('T');
        ob.display(100,100);
    }
}