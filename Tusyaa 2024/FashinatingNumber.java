class FashinatingNumber
{
    public static void main()
    {
        System.out.println("Fashinating Numbers Are");
        for(int n =100;n<=333;n++)
        {
            String s ="";
            for(int i =1;i<=3;i++)
            {
                s+= ""+(i*n);
            }
            if(isFashinating(s))
            {
                System.out.println(n);
            }
        }
    }//Main Function
    static boolean isFashinating(String s)
    {
        int count1 =0;int count2 =0;
        for(int i =1;i<=9;i++)
        {
            count1=0;
            for(int j=0;j<s.length();j++)
            {
                if(i==(s.charAt(j)-48))
                {
                    count1++;
                }
            }
            if(count1==1)
            {
                count2++;
            }
        }
        if(count2==9)
        {
            return true;
        }
        else
        {
            return false;
        }
    }//isFashinating
}//class