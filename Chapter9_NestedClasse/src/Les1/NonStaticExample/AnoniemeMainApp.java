package Les1.NonStaticExample;

public class AnoniemeMainApp {
    public static void main(String[] args) {
        Anonieme a = new Anonieme()
        {
            public void run()
            {
                System.out.println("De run methode van anonieme klas");
            }

        };
        a.run();
    }
}
