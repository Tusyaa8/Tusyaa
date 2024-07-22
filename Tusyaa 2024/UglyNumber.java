import java.util.Scanner;
class UglyNumber
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        UglyNumber ob = new UglyNumber();
        System.out.println("Enter A Number ");
        int n = sc.nextInt();
        if(ob.isUgly(n))
        {
            System.out.println("The Number is An Ugly Number");
        }
        else
        {
            System.out.println("The Number is NOT An Ugly Number");
        }
    }
    boolean isUgly(int n)
    {
        int a[] = {2,3,5};int i=0;
        while(n>1&&i<a.length)
        {
            if(n%a[i]==0)
            {
                n/=a[i];
            }
            else
            {
                i++;
            }
        }
        if(n==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}