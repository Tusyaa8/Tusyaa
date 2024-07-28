import java.util.Scanner;
class TwinPrime
{
    int n;//date Members
    boolean isPrime(int n)
    {
        int count =0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        return (count==2);
    }//isPrime
    void isTwinPrime()
    {
        int k=0,l=0;
        if(isPrime(n)&&isPrime(n+2))
        {
            output(n,n+2);
        }
        else if(isPrime(n)&&isPrime(n-2))
        {
            output(n,n-2);
        }
        else if(isPrime(n-1)&&isPrime(n+1))
        {
            output(n-1,n+1);
        }
        else
        {
            twin:for(int i=n;i>=1;i--)
            {
                for(int j=n;j>=1;j--)
                {
                    if((isPrime(i)&&isPrime(j))&&((i-j==2)||(i-j==-2)))
                    {
                        k=i;l=j;break twin;
                    }
                }
            }
            int i=n,m=0,n=0;
            while(true)
            {
                if(isPrime(i)&&isPrime(i+2))
                {
                    m=i;n=i+2;break;
                }
                else if(isPrime(i)&&isPrime(i-2))
                {
                    m=i;n=i-2;break;
                }
                i++;
            }
            if(Math.abs((k-this.n))<Math.abs((m-this.n)))
            {
                output(k,l);
            }
            else
            {
                output(m,n);
            }
        }
    }//isTwinPrime
    public static void main()
    {
        TwinPrime ob = new TwinPrime();
        ob.input();
        ob.isTwinPrime();
    }//Main Method
    void output(int n,int m)
    {
        System.out.println(n+" "+m+" Are The Nearest Twin Prime Numbers");
    }//OutoutMethod
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        n = sc.nextInt();
    }//input
}//class