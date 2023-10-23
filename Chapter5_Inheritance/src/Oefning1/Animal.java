package Oefning1;

public class Animal {
    private String typeOfAnimal;
    public Animal()
    {}

    public Animal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;

    }

    public void getTypeOfAnimal() {
        System.out.println("****** Hello I am "+typeOfAnimal + " *******");
        System.out.println();
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public void welcomeMsg()
    {
        System.out.println();
        System.out.println("Hello! Welcome to animal world");
        System.out.println("******************************");
        System.out.println();
    }
}


