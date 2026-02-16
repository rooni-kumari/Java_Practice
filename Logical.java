class Logical{
    public static void main(String[] arg)
    {
        int a=3;
        int b=2;
        int c=8;
        if((a>b)&&(a>c))
        {
            System.out.println("A is greater ");
        }
        else if((b>a)&&(b>c))
        {
            System.out.println("B is greater ");
        }
        else{
            System.out.println("C is greater ");
        }
    }
}