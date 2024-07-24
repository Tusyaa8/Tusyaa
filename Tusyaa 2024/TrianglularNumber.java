import java.util.*;
class TrianglularNumber
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        TrianglularNumber ob = new TrianglularNumber();
        System.out.println("Enter Range as N");
        System.out.println("1 to N ");
        int n = sc.nextInt();
        ob.triangularNumber(n);
    }//main
    void triangularNumber(int n)
    {
        int sum =0;
        for(int i=0;i<n;i++)
        {
            sum+=1+i;
            System.out.println(sum);
        }
    }//triangular
}//class