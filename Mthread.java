class Mainly extends Thread{
    public void run()
    {
        System.out.println("Thread is running");
    }
}
public class Mthread
{
    public static void main(String[] args){
        Mainly t1 =new Mainly();
        t1.start();
    }

}