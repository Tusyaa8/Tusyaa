import java.util.*;
class To_Binary
{    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A for Decimal to Binary ");
        System.out.println("Enter B for Decimal to Octal ");
        System.out.println("Enter C for Decimal to HexaDecimal ");
        char ch = Character.toUpperCase(sc.next().charAt(0));
        long n =0;
        String s = "";long t=0;
        switch(ch)
        {
            case 'A':
                System.out.println("Enter A Number ");
                n = sc.nextLong();
                while(n>0)
                {
                    t =n%2;
                    n/=2;
                    s=t+s;
                }
                System.out.println("Binary "+s);
                break;
            case 'B':
                System.out.println("Enter A Number ");
                n = sc.nextLong();
                while(n>0)
                {
                    t =n%8;
                    n/=8;
                    s=t+s;
                }
                System.out.println("Octal "+s);
                break;
            case 'C':
                System.out.println("Enter A Number ");
                n = sc.nextLong();
                char c='\u0000';
                while(n>0)
                {
                    t =n%16;
                    if(t>=10)
                    {
                        c = (char)(t+55);
                        s =c+s;
                    }
                    else
                    {
                        s = t+s;
                    }
                    n/=16;
                }//loop
                System.out.println("Hexa Decimal "+s);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }//Main Function
}//class