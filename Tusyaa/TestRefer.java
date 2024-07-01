class TestRefer
{
    public static void main()
    {
        int b[] = new int[5];
        TestRefer ob = new TestRefer();
        ob.method(b);
        System.out.println("Main Method"+b[0]);
    }
    void method(int a[])
    {
        a[0] = 10;
        System.out.println(a[0]);
    }
}