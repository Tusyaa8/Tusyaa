import java.util.*;
class lCM
{
    static int hcf;//static String name;
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int a = sc.nextInt();int b = sc.nextInt();
        int max = Math.max(a,b);
        for(int i=1;true;i++)
        {
            if(i%a==0&&i%b==0)
            {
                hcf=i;break;
            }
        }
        System.out.println("HCF "+hcf);
        //System.out.println(nam);
    }
}