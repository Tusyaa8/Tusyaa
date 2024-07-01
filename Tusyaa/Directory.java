import java.util.*;
class Directory
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File Directory");
        String dir = new String(sc.nextLine());
        String CopyOfDir = new String(dir);
        boolean isThere[] = new boolean [3]; int j=0;
        for(int i =0;i<dir.length();i++)
        {
            if("\\ :".lastIndexOf(dir.charAt(i))!=-1)
            {
                isThere[j]=true;
                j++;
            }
            if(isThere[0]&&isThere[1])
            {
                break;
            }
        }
        for(int i =0;i<dir.length();i++)
        {
            if(".".lastIndexOf(dir.charAt(i))!=-1)
            {
                isThere[2]=true;
            }
            if(isThere[2])
            {
                break;
            }
        }
        int i =0;
        if(isThere[0]&&isThere[1]&&isThere[2])
        {
            i = dir.lastIndexOf('\\');
            j = dir.lastIndexOf('.');
        }
        else
        {
            System.out.println("Enter Valid Directory");
            System.exit(0);
        }
        String pathName = dir.substring(0,(i+1));
        String fileName = dir.substring((i+1),j);
        String extensionName = dir.substring((j+1));
        System.out.println("Path Name "+pathName);
        System.out.println("File Name "+fileName);
        System.out.println("Extension "+extensionName);
    }
}