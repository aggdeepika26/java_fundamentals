package Example6;

public class DifferentTestClass extends TestInstanceOf {
    public static  void method01(TestInstanceOf test)
    {
        if(test instanceof DifferentTestClass)
        {
            DifferentTestClass dtc = (DifferentTestClass)test;
            System.out.println("Downcasting works");
        }
    }

}
