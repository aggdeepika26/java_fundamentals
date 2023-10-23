package Oefning1;

public class AnimalApp {
    public static void main(String[] args)

    {

        Carnivorous carnivorous = new Carnivorous();   // Invoke Carnivorous constructor and super() in constructor invokes Animal class constructor
        Herbivorous herbivorous = new Herbivorous();   // Invoke Herbivorous constructor and super() in constructor invokes Animal class constructor
        Omnivorous omnivorous = new Omnivorous();      // Invoke Omnivorous constructor and super() in constructor invokes Animal class constructor
        System.out.println();
        System.out.println();
        System.out.println("Category Carnivorous");
        carnivorous.welcomeMsg();                      // method in Animal Class
        carnivorous.getTypeOfAnimal();                 //method in Animal Class
        carnivorous.carniEatingHabit();                //method in carnivorous Class
        carnivorous.carniHobbies();                    //method in carnivorous Class

        System.out.println();
        System.out.println();
        System.out.println("Category Herbivorous");
        herbivorous.welcomeMsg();                      // method in Animal Class
        herbivorous.getTypeOfAnimal();                 // method in Animal Class
        herbivorous.herbiEatingHabit();                //method in herbivorous Class
        herbivorous.herbiHobbies();                    //method in herbivorous Class

        System.out.println();
        System.out.println();
        System.out.println("Category Omnivorous");
        omnivorous.welcomeMsg();                      // method in Animal Class
        omnivorous.getTypeOfAnimal();                 // method in Animal Class
        omnivorous.omniEatingHabit();                 //method in Omnivorous Class
        omnivorous.omniHobbies();                     //method in Omnivorous Class





    }
}
