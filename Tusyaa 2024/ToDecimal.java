import java.util.*;
class ToDecimal
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A for Binary to Decimal");
        System.out.println("Enter B for Octal to Decimal");
        System.out.println("Enter C for HexaDecimal to Decimal");
        char ch = Character.toUpperCase(sc.next().charAt(0));
        String s = "";int c =0;
        long decimal=0;long n =0;long r =0;
        switch(ch)
        {
            case 'A':
                System.out.println("Enter A Number");
                s = sc.next();n = Long.valueOf(s);
                while(n>0)
                {
                    r = n%10;
                    decimal += r*(long)(Math.pow(2,c));
                    n/=10;c++;
                }
                break;
            case 'B':
                System.out.println("Enter A Number");
                s = sc.next(); n = Long.valueOf(s);
               while(n>0)
                {
                    r = n%10;
                    decimal += r*(long)(Math.pow(8,c));
                    n/=10;c++;
                }
                break;
            case 'C':
                System.out.println("Enter A Number");
                s = sc.next();
                int i = s.length();
                while(!(s.equals("")))
                {
                    char temp = s.charAt(--i);
                    if(Character.isLetter(temp))
                    {
                        temp = Character.toUpperCase(temp);
                        n = temp-55;
                    }
                    else
                    {
                        n = temp-48;
                    }
                    decimal += n*(long)(Math.pow(16,c));
                    c++;s=s.substring(0,i);
                }//loop
                break;
            default:
                System.out.println("Invalid Choice");
                System.exit(0);
        }
        System.out.println("Decimal "+decimal); 
    }//Main Function
}//class