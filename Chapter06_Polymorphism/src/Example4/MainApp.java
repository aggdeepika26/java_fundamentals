package Example4;

import javax.swing.text.AsyncBoxView;

public class MainApp {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.Name = "IntecBrussel";
        System.out.println(parent.Name);
        parent.method();


        //Downcasting making parent object , object of child
        Child child = (Child)parent;
        System.out.println(child.Name);
        child.method();

    }
}
