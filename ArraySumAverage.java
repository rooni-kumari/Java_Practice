import java.util.Scanner;
public class ArraySumAverage{
    public static void main(String[] args0)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter number of element : ");
        int n =sc.nextInt();
        int[] arr = new int[n];int sum =0;
        System.out.println("enter elements : ");
        for(int i =0 ; i<n ; i++)
        {
            arr[i]=sc.nextInt();
            sum += arr[i];
        }
        double average = (double)sum/n;
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+average);
    }
}