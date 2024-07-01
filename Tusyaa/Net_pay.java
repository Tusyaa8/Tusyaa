import java.util.*;
class Net_pay
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        double basic = sc.nextDouble();
        double net,tax;
        if(basic<10000)
        {
            tax=(5.0/100.0)*basic;
        }
        else if(basic<20000)
        {
            tax=(7.5/100.0)*basic;
        }
        else
        {
            tax=(10.0/100.0)*basic;
        }
        net=basic-tax;
        System.out.println("Net Pay: "+ net);
    }
}