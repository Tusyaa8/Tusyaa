import java.util.*;
class Dec_Numbers
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int d =10;
        double a[] = new double[d];
        double Out[] = new double[d];
        int p=0,n=Out.length-1;
        for(int i =0;i<a.length;i++)
        {
            a[i] = sc.nextDouble();
            if(a[i]>0)//+ve
            {
                Out[p] = a[i];
                p++;
            }
            else if(a[i]<0)//-ve
            {
                Out[n] = a[i];
                n--;
            }
        } int i =0;
        while(i<Out.length)
        {
            System.out.println(Out[i]);i++;
        }
    }
}