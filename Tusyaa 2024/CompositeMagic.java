import java.util.Scanner;
class CompositeMagic
{
    int n,m;//data Members
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Range");
        System.out.println("N to M");
        System.out.println("N");
        n = sc.nextInt();
        System.out.println("M");
        m = sc.nextInt();
    }//Input Funcion
    public static void main()
    {
        CompositeMagic ob = new CompositeMagic();
        ob.input();
        ob.generateCompositeMagicNumber();
    }//Main Function
    void generateCompositeMagicNumber()
    {
        int count =0;
        for(int i=n;i<=m;i++)
        {
            if(isCompositeMagic(i))
            {
                count++;
                if(count==1)
                {
                    System.out.println("The Composite Magic Numbers Are");
                }
                System.out.println(i);
            }
        }//loop
        if(count==0)
        {
            System.out.println("There Are No Composite Magic Numbers Within The Given Range");
        }
    }//Generating
    boolean isCompositeMagic(int n)
    {   
        if(isMagic(n)&&isComposite(n))
        {
            return true;
        }
        else
        {
            return false;
        }
    }//BothCompositeMagic
    boolean isMagic(int n)
    {
        int sum =n;
        while(n>9)
        {   
            sum =0;
            while(n>0)
            {
                int r = n%10;
                sum+=r;
                n/=10;
            }
            n = sum;
        }
        if(n==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }//isMagic
    boolean isComposite(int n)
    {
        int count =0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count>2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }//isComposite
}//class