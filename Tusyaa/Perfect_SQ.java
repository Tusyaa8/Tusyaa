import java.util.*;
class Perfect_SQ
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        for(int i = 0;i<array.length;i++)
        {
            array[i] = sc.nextInt();
            if(Math.sqrt(array[i])==(int)(Math.sqrt(array[i])))
            {
                System.out.println("Perfect Square "+array[i]);
            }
        }
    }
}