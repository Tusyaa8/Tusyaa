import java.util.*;
class SmithNumber
{
    int add(String s)
    {
        int sum =0;
        int n =Integer.valueOf(s);
        while(n>0)
        {
            int r = n%10;
            sum+=r;
            n/=10;
        }
        return sum;
    }//add
    public static void main()
    {
        SmithNumber ob = new SmithNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number ");
        int n = sc.nextInt(); int i=2;
        String s ="";String m=String.valueOf(n);
        while(n>1)
        {
            if(n%i==0)
            {
                s+=i;
                n/=i;
            }
            else
            {
                i++;
            }
        }
        if(ob.add(s)==ob.add(m))
        {
            System.out.println(m+" is a Smith Number");
        }
        else
        {
            System.out.println(m+" NOT a Smith Number");
        }
    }//Main Function
}//class