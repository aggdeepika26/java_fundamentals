package Les1;

public class DemoExtendsThread extends Thread{
    public void run()
    {
        try
        {
            System.out.println("thread  " + Thread.currentThread().getId() + " is running");
        }
        catch(Exception e)
        {
            System.out.println("Exception is caught");
        }
    }

}
