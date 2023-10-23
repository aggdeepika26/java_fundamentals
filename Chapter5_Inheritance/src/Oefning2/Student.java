package Oefning2;
public class Student extends Person {
    private String name;

    Student() {
        super();
    }

    public void nameOfStudent(String name) {
        this.name = name;

    }

    public void admOfStudent() {
        System.out.println("Hello " + name);
        System.out.println();
        System.out.println("We are pleased to inform you that you are selected for " + diploma + " course");
    }

}