package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Scott
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    @Override
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    @Override
    public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println("Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getPrerequisites() {
        return prerequisites;
    }
}
