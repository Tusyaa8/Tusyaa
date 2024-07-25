import java.util.Scanner;
class KeithNumber
{
    boolean isKeith(int n)
    {
        String s = String.valueOf(n);
        int a[] = new int[s.length()+1];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            a[i]=ch-48;
        }
        boolean sw = false;
        while(a[a.length-1]<=n)
        {
            for(int i=0;i<a.length-1;i++)
            {
                a[a.length-1]+=a[i];
            }
            for(int i=0;i<a.length-1;i++)
            {
                a[i]=a[i+1];
            }
            if(a[a.length-1]==n)
            {
                sw = true;
                break;
            }
            a[a.length-1]=0;
        }
        return sw;
    }//isKeith
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        KeithNumber ob = new KeithNumber();
        System.out.println("Enter A Number ");
        int n = sc.nextInt();
        if(ob.isKeith(n))
        {
            System.out.println(n+" Is A Keith Number");
        }
        else
        {
            System.out.println(n+" Is NOT A Keith Number");
        }
    }//Main Method
}