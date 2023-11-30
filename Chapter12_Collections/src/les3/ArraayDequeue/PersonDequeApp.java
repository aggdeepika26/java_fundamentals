package les3.ArraayDequeue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class PersonDequeApp {
    public static void main(String[] args) {
        Deque<Person> persons = new ArrayDeque<>();
        //Person.Gender[] gender = Person.Gender.values();
        persons.offerFirst(new Person("Matt", Person.Gender.MALE));
        persons.offerFirst(new Person("John", Person.Gender.MALE));
        persons.offerFirst(new Person("Jerry", Person.Gender.MALE));
        persons.offerLast(new Person("Katy", Person.Gender.FEMALE));
        persons.offerLast(new Person("Suzan", Person.Gender.FEMALE));
        persons.offerLast(new Person("Merry", Person.Gender.FEMALE));
        Person person  = persons.pollFirst();
        while(person != null)
        {
            System.out.println("Couples are   :" + person +  "   " + persons.pollLast());
            person = persons.pollFirst();
        }


    }

}
