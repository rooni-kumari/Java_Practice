class Cal{

    static int add(int a,int b)
    {
        return a+b;
    }
    static int sub(int a,int b)
    {
        return a-b;
    }
    static int mul(int a,int b)
    {
        return a*b;
    }
    static int div(int a,int b)
    {
        return a/b;
    }
    static int mod(int a,int b)
    {
        return a%b;
    }
    public static void main(String arg[])
    {
        System.out.println("Add is "+add(10,20));
        System.out.println("Sub is "+sub(10,20));
        System.out.println("Multiplication is "+mul(10,20));
        System.out.println("Division is "+div(10,20));
        System.out.println("Modulas is "+mod(10,20));
    }
}