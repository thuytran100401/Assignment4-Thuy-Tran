/**
 * Exercise 2:
 * Course Class:
 * This class should contain the following fields: course name, course
 * description,
 * department, time the course starts, weekday the course is held on (for
 * simplicity,
 * let us assume the course only meets once a week). This class should contain
 * getters
 * and setters for all its attributes. This class also needs at least one
 * constructor.
 * 
 * @author Thuy Tran
 *         April 3, 2022
 */

public class Course {
    private String courseName, courseDes, department, time, day;

    /**
     * Course construction default
     */
    public Course() {
        courseName = "";
        courseDes = "";
        department = "";
        time = "";
        day = "";
    }

    /**
     * Course construction
     * 
     * @param courseName name of the course
     * @param courseDes  the description of the course
     * @param department department of the course
     * @param time       time the course starts
     * @param day        weekday the course is held on
     */
    public Course(String courseName, String courseDes, String department, String time, String day) {
        this.courseName = courseName;
        this.courseDes = courseDes;
        this.department = department;
        this.time = time;
        this.day = day;
    }

    /**
     * Getting the name of the course
     * 
     * @return name of the course
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Getting the description of the course
     * 
     * @return description of the course
     */
    public String getCourseDes() {
        return courseDes;
    }

    /**
     * Getting department of the course
     * 
     * @return department of the course
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Getting time the course starts
     * 
     * @return time the course starts
     */
    public String getTime() {
        return time;
    }

    /**
     * Getting weekday the course is held on
     * 
     * @return weekday the course is held on
     */
    public String getDay() {
        return day;
    }

    /**
     * Assign a new course name
     * 
     * @param courseName name of the course
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Assign a new course description
     * 
     * @param courseDes the description of the course
     */
    public void setCourseDes(String courseDes) {
        this.courseDes = courseDes;
    }

    /**
     * Assign a new course department
     * 
     * @param department department of the course
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Assign a new time the course starts
     * 
     * @param time time the course starts
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Assign a new weekday the course is held on
     * 
     * @param day weekday the course is held on
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Convert Course into String
     * In a format:
     * Course: <courseName>
     * Description: <courseDes>
     * Department: <department>
     * Start time: <time>
     * Day: <day>.
     */
    @Override
    public String toString() {
        return "Course: " + getCourseName() +
                "\nDescription: " + getCourseDes() +
                "\nDepartment: " + getDepartment() +
                "\nStart Time: " + getTime() +
                "\nDay " + getDay() + "\n";
    }

}