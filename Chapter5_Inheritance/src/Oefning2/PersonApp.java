package Oefning2;

public class PersonApp {
    public static void main(String[] args) {
        Student student = new Student();   //invoke Constructor of Student Class and super() invokes Person super class constructor
                                           // in super class constructor this() invokes current class constructor

        student.nameOfStudent("Deepika"); // calls method in Student class
        student.admOfStudent();           //call method of student class
        System.out.println();
        student.diplomaInfo();           //call method of Person App

    }
}
