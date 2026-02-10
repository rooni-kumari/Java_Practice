import java.util.*;


class Calculator{
    public static void main(String arg[])
    {
        int a=15;
        int b=10;
        int c =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("choice operators 1.+ ,2. - ,3. * ,4. / ,5. % ");
        int choice= sc.nextInt();

        switch(choice)
        {
            case 1:
                c=a+b;
                break;
            case 2:
                c=a-b;
                break;
            case 3:
                c=a*b;
                break;
            case 4:
                c=a/b;
                break;
            case 5:
                c=a%b;
                break;
            default:
                System.out.println("enter input is not correct");
        }
        System.out.println("output is :"+c);
    }
}