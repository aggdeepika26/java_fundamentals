package les3.ArraayDequeue;

public class Person {
    String name;
    public enum Gender
    {
        MALE,FEMALE;
    }
    Gender gender;
    String persons;

    public Person(String name , Gender gender)
    {
        this.name=name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
