import java.util.Scanner;
class UniqueNumber
{
    boolean isUnique(int n)
    {
        if(n>0)
        {
            String s = String.valueOf(n);
            String t = "";
            for(int i =0;i<s.length();i++)
            {
                if(t.indexOf(s.charAt(i))==-1)
                {   
                    t+=s.charAt(i);
                }
            }
            if(t.equals(s))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }//isUnique
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        UniqueNumber ob = new UniqueNumber();
        System.out.println("Enter The Range\n");
        System.out.println("Starting Number");
        int m = sc.nextInt();
        System.out.println("Ending Number");
        int n = sc.nextInt();
        if(m>0||n>0)
        {
            System.out.println("Unique Numbers Are ");
            for(int i=m;i<=n;i++)
            {
                if(ob.isUnique(i))
                {
                    System.out.println(i);
                }
            }
        }
        else
        {
            System.out.println("The Are No Unique Numbers in the Given Range");
        }
    }//Main Function
}//class