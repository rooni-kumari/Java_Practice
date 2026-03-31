import java.util.Scanner;
public class Age{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age : ");
        int age = sc.nextInt();
        try{
            if(age<0) throw new ArithmeticException();
        }
        finally{
            System.out.println(" finally");
            
        }

        
        System.out.println("after exception");
    }
}