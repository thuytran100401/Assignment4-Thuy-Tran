/**
 * Exercise 3:
 * Person Class:
 * This class should contain the following fields: first name, last name, and
 * age (int).
 * This class should contain getters and setters for all its attributes.
 * This class also needs at least one constructor.
 * 
 * @author Thuy Tran
 *         April 3, 2022
 */

public class Person {
    private String firstName, lastName;
    private int age;

    /**
     * Default Constructor of person class
     */
    public Person() {
        firstName = "unknown";
        lastName = "unknown";
        age = 0;
    }

    /**
     * Constructor of Person class
     * 
     * @param firstName first name of a person
     * @param lastName  last mane of a person
     * @param age       age of a person
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * get the person first name
     * 
     * @return first name of a person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * get the person last name
     * 
     * @return last name of a person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * get an age of a person
     * 
     * @return age of a person
     */
    public int getAge() {
        return age;
    }

    /**
     * set the new person first name
     * 
     * @param firstName first name of a person
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * set the new person last name
     * 
     * @param lastName last mane of a person
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * set a new age for a person
     * 
     * @param age age of a person
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Convert a person into a string
     * in the format:
     * Name: <firstName> <lastName>
     * Age: <age>
     */
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nAge: " + age;
    }

}