
/**
 * Exercise 2: 
 * The Student Class:
 *  This class should contain the following fields: first name, last name, age (int), gpa (float), major, department, courses.
 *  Courses should be a linked list of Course variables. 
 *  Class Student should contain getters and setters for all its attributes. 
 * 
 * @author Thuy Tran
 * April 3, 2022
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Comparator;

public class Student {
    private String firstName, lastName, major, department;
    private int age;
    private float gpa;
    private LinkedList<Course> courses;

    /**
     * This is constructor of Student class
     * 
     * @param firstName  first name of a student
     * @param lastName   last name of a student
     * @param major      student's college major
     * @param department student's college major department
     * @param age        student's age
     * @param gpa        student's gpa
     * @param course     the course that student take
     */
    public Student(String firstName, String lastName, int age, float gpa, String major, String department,
            LinkedList<Course> courses) {
        this.courses = courses;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.department = department;
        this.age = age;
        this.gpa = gpa;
    }

    /**
     * Getting first name of a student
     * 
     * @return firstName return first name of a student
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getting last name of a student
     * 
     * @return return last name of a student
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Getting student's major
     * 
     * @return return student's major
     */
    public String getMajor() {
        return major;
    }

    /**
     * Getting student's department
     * 
     * @return student's college department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Getting student's age
     * 
     * @return student's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Getting a student's gpa
     * 
     * @return student's gpa
     */
    public float getGpa() {
        return gpa;
    }

    /**
     * getting the courses student take
     * 
     * @return courses that student take
     */
    public LinkedList<Course> getCourses() {
        return courses;
    }

    /**
     * Set the new student first name
     * 
     * @param firstName first name of a student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * set the new student last name
     * 
     * @param lastName last name of a student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * set the new college major for a student
     * 
     * @param major student's college major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * set the new college major department for a student
     * 
     * @param department student's college major department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * set new student's age
     * 
     * @param age student's age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * set new student's gpa
     * 
     * @param gpa student's gpa
     */
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    /**
     * Add a new course into the course list
     * 
     * @param course the course that student take
     */
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    /**
     * Remove the course of a student in course list
     * 
     * @param course the course that student need remove
     */
    public void removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
        }
    }

    public void sortCourses(String attribute, boolean ascending) {
        HashMap<String, Integer> dayMapping = new HashMap<String, Integer>();
        dayMapping.put("Sunday", 0);
        dayMapping.put("Monday", 1);
        dayMapping.put("Tuesday", 2);
        dayMapping.put("Wednesday", 3);
        dayMapping.put("Thursday", 4);
        dayMapping.put("Friday", 5);
        dayMapping.put("Saturday", 6);

        Collections.sort(courses, new Comparator<Course>() {
            @Override
            public int compare(Course a1, Course a2) {
                switch (attribute) {
                    case "name":
                        return a1.getCourseName().compareTo(a2.getCourseName());
                    case "department":
                        return a1.getDepartment().compareTo(a2.getDepartment());
                    case "time":
                        return a1.getTime().compareTo(a2.getTime());
                    case "day":
                        return dayMapping.get(a1.getDay()) - dayMapping.get(a2.getDay());
                    default:
                        return a1.getCourseName().compareTo(a2.getCourseName());
                }
            }
        });
        if (!ascending) {
            Collections.reverse(courses);
        }
        for (Course c : courses) {
            System.out.println(c);
        }
    }

    /**
     * convert student into a string
     * in a format:
     * <firstName> <lastName>, <age> year old, <gpa> gpa, <major> major,
     * <department> department.
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + age + " year old, " + gpa + " gpa, " + major + " major, "
                + department + " department.";
    }

    // Print out the student info.
    public void printInfo() {
        System.out.println("Name: " + getFirstName() + " " + getLastName() +
                "\nAge: " + getAge() + " years old" +
                "\nGPA: " + getGpa() +
                "\nMajor: " + getMajor() +
                "\nDepartment: " + getDepartment());
        System.out.println("\nCourse List:");
        for (Course c : courses) {
            System.out.println(c);
        }
    }
}