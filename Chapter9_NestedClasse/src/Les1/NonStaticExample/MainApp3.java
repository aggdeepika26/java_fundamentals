package Les1.NonStaticExample;

import Les1.StaticExample.StaticExample2;

public class MainApp3 {
    public static void main(String[] args) {
        NonStaticExample nonStaticExample = new NonStaticExample();
        NonStaticExample.inner innerObj = nonStaticExample.new inner();
        nonStaticExample.run();
        innerObj.run();
    }


}
