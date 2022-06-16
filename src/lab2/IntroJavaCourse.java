package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      Scott
 * @version     1.00
 */
public class IntroJavaCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double courseCredits;
    private String prerequisites;

    @Override
    public final String CourseName() {
        courseName = "Intro to Java";
        return courseName;
    }

    @Override
    public final String CourseNumber() {
        courseNumber = "101-5";
        return courseNumber;
    }

    @Override
    public final double CourseCredits() {
        courseCredits = 3.5;
        return courseCredits;
    }

    @Override
    public final String Prerequisites() {
        prerequisites = "Intro to programming";
        return prerequisites;
    }

    
}
