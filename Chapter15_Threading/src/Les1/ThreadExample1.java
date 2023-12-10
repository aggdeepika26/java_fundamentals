package Les1;

public class ThreadExample1 extends Thread{
    private String sign;
    private Integer number;
    public ThreadExample1(String sign , Integer number)
    {
        this.sign = sign;
        this.number = number;
    }
    public ThreadExample1(String sign)
    {
        this.sign = sign;

    }

    public  ThreadExample1()
    {

    }
    public void run()
    {
        for(int i = 0 ; i<=10 ; i++)
        {
            System.out.println(sign+ " ");
        }
    }
}
