package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Scott
 * @version     1.00
 */
public class AdvancedJavaCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double courseCredits;
    private String prerequisites;
    
    @Override
    public final String CourseName() {
        courseName = "Advanced Java";
        return courseName;
    }
    
    
    @Override
    public final String CourseNumber() {
        courseNumber = "102-4";
        return courseNumber;
    }
    
    @Override
    public final double CourseCredits() {
        courseCredits = 4;
        return courseCredits;
    }
    
    @Override
    public final String Prerequisites() {
        prerequisites = "Intro to programming and Intro to Java";
        return prerequisites;
    }
}