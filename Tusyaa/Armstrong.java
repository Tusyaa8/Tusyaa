import java.util.*;
class Armstrong
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        Armstrong obj = new Armstrong();
        int f = obj.isArmStrong(n);
        if(f==1)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not An Armstrong Number");
        }
    }//Main Function
    private int isArmStrong(int a)
    {
        String s = String.valueOf(a);int c=0;
        int arr[] = new int[s.length()];int sum=0;
        while(a>0)
        {
            int r = a%10;
            a = a/10;
            arr[c] = r;
            c++;
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = (int)(Math.pow(arr[i],c));
            sum+=arr[i];
        }
        if(sum==Integer.valueOf(s))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}