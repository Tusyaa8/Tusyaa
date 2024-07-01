import java.io.*;
class Even_Odd
{
    public static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter N");
        int n = Integer.parseInt(in.readLine());
        int a[] = new int[n];
        int Out[] = new int[a.length];
        int E = 0,O = a.length-1;
        for(int i =0;i<a.length;i++)
        {
            a[i] = Integer.parseInt(in.readLine());
            if(a[i]%2==0)//Even
            {
                Out[E] = a[i];
                E++;
            }
            else if(a[i]%2!=0)//Odd
            {
                Out[O] = a[i];
                O--;
            }
        }
        System.out.println("Arranged Value");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(Out[i]);
        }
    }//Main Function
}//class