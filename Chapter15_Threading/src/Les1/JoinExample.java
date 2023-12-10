package Les1;

public class JoinExample {
    public static void main(String[] args) {
        try
        {
            Thread studeren = new Thread((new ThreadExample1()));
            Thread gamen= new Thread((new ThreadExample1()));
            Thread eten = new Thread((new ThreadExample1()));
            //begint met studeren
            studeren.start();
            //je beslist na 1000 ms om tijdens het studeren te gamen
            studeren.join(1000);
            //gamen start dus pas na die 1000 ms
            gamen.start();
            // je specifeert geen tijd
            gamen.join();
            // pas als je klaar bent met studeren en gamen ga je eten
            eten.start();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
