class Check
{
    void check_sum(int a,int b,char ch)
    {
        if(ch=='E'||ch=='e')
        {
            if(a%2==0&&b%2==0)
            {
                System.out.println("Even Number");
            }
            else
            {
                System.out.println("Not an Even Number");
            }
        }
        else
        {
            int sum=a+b,c=0;
            for(int i=1;i<=sum;i++)
            {
                if(sum%i==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println("Prime Number");
            }
            else
            {
                System.out.println("Not a Prime Number");
            }
        }
    }
    void check_sum(char a,char b,int n)
    {
        if(n%2==0)
        {
            System.out.println(a+b);
        }
        else
        {
            System.out.println(""+a+b);
        }
    }
    void check_sum(int a,int b,int c,char ch)
    {
        if(ch=='A'||ch=='a')
        {
            System.out.println((a+b+c)/3.0);
        }
        else
        {
            System.out.println(a>b?a>c?a:b:b>c?b:c);
        }
    }
    public static void main()
    {
        Check ob = new Check();
        ob.check_sum(23,56,'e');
        ob.check_sum('t','d',30);
        ob.check_sum(7,30,10,'T');
    }
}