package Example5;

public class MainTest {
    public static void main(String[] args) {
        TestInstanceOf object01 = new TestInstanceOf();

        System.out.println(object01 instanceof TestInstanceOf);
        System.out.println(object01 instanceof DifferentTestClass);

        DifferentTestClass object02 = new DifferentTestClass();
        System.out.println(object02 instanceof TestInstanceOf);
    }
}
