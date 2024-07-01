import java.util.*;
class Perfect_Number
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        int a[] = new int [n];
        int p[]=new int [n];int s=0;
        System.out.println("Enter numbers");
        int pn=0;
        for(int i=0;i<a.length;i++)
        {
            s=0;
            a[i] = sc.nextInt();
            for(int j = 1;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    s+=j;
                }
            }
            if(s==a[i])
                {
                    p[pn] = a[i];
                    pn++;
                }
        }
        for(int i =0;i<pn;i++)
        {
            System.out.println(p[i]+" ");
        }
    }
}