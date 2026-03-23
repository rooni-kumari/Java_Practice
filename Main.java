import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter first number");
            int n1 =sc.nextInt();
            System.out.println("enter second number");
            int n2 = sc.nextInt();
            int div = n1/n2;
            System.out.println("Division is : "+div);
        }
        catch(InputMismatchException I)
        {
            System.out.println("enter only integer value ");
        }
        catch(ArithmeticException n)
        {
           System.out.println(n.getMessage());     //show only exception message as output example "/ by zero"
            
            n.printStackTrace();       //show exception as ouput message (fully) example "java.lang.ArithmeticException: / by zero at Main.main(Main.java:12)
        }
        finally{
            System.out.println("Finally");
            sc.close();
        }

        System.out.println("outof the box ");
    }
}