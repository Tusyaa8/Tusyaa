class MethodMax
{
    void compare(int a,int b)
    {
        System.out.println(Math.max(a,b));
    }
    void compare(char a,char b)
    {
        System.out.println(Math.max(a,b));
    }
    void compare(String a,String b)
    {
        System.out.println(Math.max(a.length(),b.length()));
    }
    public static void main()
    {
        MethodMax ob = new MethodMax();
        ob.compare(12,13);
        ob.compare('a','A');
        ob.compare("WElcome","HI");
    }
}