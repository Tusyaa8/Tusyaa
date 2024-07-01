class Show
{
    void show(int n)
    {
        for(int i=0;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
    void show(int m,int n)
    {
        for(int i=m;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
    void show(int m,int n,int p)
    {
        for(int i=m;i<=n;i++)
        {
            if(i%p==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main()
    {
        Show ob = new Show();
        ob.show(5);
        ob.show(9,12);
        ob.show(1,100,23);
    }
}