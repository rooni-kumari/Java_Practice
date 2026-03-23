import java.util.Scanner;
class AgeException extends RuntimeException{
    AgeException()
    {
        super("this is my negative age exeption :");
    }
}


public class Except{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        if(age<0) throw new AgeException();
        System.out.println("after age exception");
       System.out.println("Age is : "+age);
    }
}