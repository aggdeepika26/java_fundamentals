package SleepExample;

public class ThreadExample2 extends Thread {
    private String sign;
    private Integer number;
    public ThreadExample2(String sign , Integer number)
    {
        this.sign = sign;
        this.number = number;
    }
    public ThreadExample2(String sign)
    {
        this.sign = sign;

    }

    public  ThreadExample2()
    {

    }
    public void run()
    {
        for(int i = 0 ; i<=10 ; i++)
        {
            System.out.println(sign+ " " + number);
        }
    }
}
