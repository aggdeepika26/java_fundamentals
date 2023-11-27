package OptionalPackage;

import java.util.Optional;

public class PersonApp {
    public static void main(String[] args) {
        Person person = Person.getPerson("bob1");
        System.out.println(person.getName());

        Optional<Person> person2 = Person.getPersonOptional("Jeant");
        System.out.println(person2.isPresent() ? person2.get().getName(): " No");
    }
}
