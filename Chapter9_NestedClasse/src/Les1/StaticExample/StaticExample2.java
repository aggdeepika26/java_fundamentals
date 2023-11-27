package Les1.StaticExample;

public class StaticExample2 {
    private int a = 10; // Wij kunnen niet toegang non static member naar de static class
    private int c = 20; // Wij kunnen niet toegang non static member naar de static class
    private static int b = 2;
    public static class Inner{
        int a = 1;
        public void run()
        {
            System.out.println(a);
            System.out.println(this.a);
            //System.out.println(Static.this.a);
            System.out.println(b);
            //System.out.println(c);// Wij kunnen niet toegang non static member naar de static class

        }
    }
}
