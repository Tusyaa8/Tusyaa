import java.util.Scanner;
class TwinPrime
{
    int n,m;//date Members
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
        int count =0;
        for(int i =n;i<=m;i++)
        {
            for(int j =i;j<=m;j++)
            {
                if(isPrime(i)&&isPrime(j))
                {
                    if(j-i==2||j-i==-2)
                    {
                        count++;
                        System.out.print((count==1)?"Twin Pirme Numbers Are\n":"");
                        System.out.println(i+" "+j);
                    }
                }
            }
        }
        System.out.println((count==0)?"There Are No Twin Prime Numbers Within the Given Range":"");
    }//isTwinPrime
    public static void main()
    {
        TwinPrime ob = new TwinPrime();
        ob.input();
        ob.isTwinPrime();
    }//Main Method
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Range");
        System.out.println("N to M");
        System.out.println("N");
        n = sc.nextInt();
        System.out.println("M");
        m = sc.nextInt();
    }//input
}//class