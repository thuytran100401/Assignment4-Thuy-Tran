
/**
 * Exercise 3:
 * PersonTest Class:
 *  This class should implement main() method.
 * 
 * @author Thuy Tran 
 * April 3, 2022
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonTest {
    private static ArrayList<Person> person;

    public static void main(String[] args) {

        person = new ArrayList<Person>();
        Person a = new Person("Joe", "Smith", 40);
        Person b = new Person("Amy", "Gold", 32);
        Person c = new Person("Tony", "Stork", 21);
        Person d = new Person("Sean", "Irish", 24);
        Person e = new Person("Tina", "Brock", 28);
        Person f = new Person("Lenny", "Hep", 18);
        person.add(a);
        person.add(b);
        person.add(c);
        person.add(d);
        person.add(e);
        person.add(f);
        System.out.println("Sort based on first name in ascending");
        sort("first name", true);
        System.out.println("Sort based on first name in descending");
        sort("first name", false);
        System.out.println("Sort based on last name in ascending");
        sort("last name", true);
        System.out.println("Sort based on last name in descending");
        sort("last name", false);
        System.out.println("Sort based on age in ascending");
        sort("age", true);
        System.out.println("Sort based on age in descending");
        sort("age", false);

    }

    // Sort the persons based on their age, first name, and last name
    public static void sort(String attribute, boolean ascending) {
        Collections.sort(person, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                switch (attribute) {
                    case "age":
                        return Integer.compare(p1.getAge(), p2.getAge());
                    case "first name":
                        return p1.getFirstName().compareTo(p2.getFirstName());
                    case "last name":
                        return p1.getLastName().compareTo(p2.getLastName());
                    default:
                        return p1.getFirstName().compareTo(p2.getFirstName());
                }
            }
        });
        if (!ascending) {
            Collections.reverse(person);
        }
        for (Person p : person) {
            System.out.println(p);
        }
        System.out.println("*******************");
    }

}
