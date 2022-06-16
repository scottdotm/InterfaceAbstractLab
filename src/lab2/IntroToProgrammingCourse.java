package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      Scott
 * @version     1.00
 */
public class IntroToProgrammingCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double courseCredits;

    @Override
    public final String CourseName() {
        courseName = "Intro to Programming";
        return courseName;
    }

    @Override
    public final String CourseNumber() {
        courseNumber = "102-1";
        return courseNumber;
    }

    @Override
    public final double CourseCredits() {
        courseCredits = 2;
        return courseCredits;
    }

    @Override
    public final String Prerequisites() {
        return null;
    }


    
}
