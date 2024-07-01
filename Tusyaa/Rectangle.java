import java.util.*;
class Rectangle
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a for area\n" + "Enter p for perimeter\n" + "Enter d for diagonal");
        char ch = sc.next().charAt(0);
        System.out.println("Enter Length");
        int l = sc.nextInt();
        System.out.println("Enter Breadth");
        int b = sc.nextInt();
        double d=0.0;
        switch(ch)
        {
            case 'a':
                d = l*b;
                break;
            case 'p':
                d = 2*(l+b);
                break;
            case 'd':
                d = Math.sqrt((l*l)+(b*b));
        }
        System.out.println("Answer = " + d);
        }
}