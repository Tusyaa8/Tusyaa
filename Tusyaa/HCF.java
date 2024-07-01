import java.util.*;
class HCF
{
    static int hcf;static String name;
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int a = sc.nextInt();int b = sc.nextInt();
        int min = Math.min(a,b);
        for(int i=min;i>=1;i--)
        {
            if(a%i==0&&b%i==0)
            {
                hcf=i;break;
            }
        }
        System.out.println("HCF "+hcf);
        System.out.println(name);
    }
}