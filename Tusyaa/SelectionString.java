import java.util.*;
class SelectionString
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String s[] = new String[5];
        System.out.println("Enter the String");
        for(int i=0;i<s.length;i++)
        {
            s[i] = sc.next().trim().toLowerCase();
        }
        int min=0;
        for(int i=0;i<s.length-1;i++)
        {
            min = i;
            for(int j=min+1;j<s.length;j++)
            {
                if(s[min].compareTo(s[j])>0)
                {
                    min = j;
                }
            }
            String t = s[i];
            s[i] =s[min];
            s[min] =t;
        }
        for(int i=0;i<s.length;i++)
        {
            char ch = s[i].charAt(0);
            ch = Character.toUpperCase(ch);
            String wd = s[i].substring(1);
            System.out.println(ch+wd);
        }
    }
}