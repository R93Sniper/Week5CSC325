package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public abstract class Student extends Human {

    protected int gpa;
    protected int credits;
    protected String studentAddress;

    public Student(){}
    
    /**
     * Default Constructor
     *
     * @param studentName Name of the Student
     * @param studentAge Age of the Student
     * @param studentCredits The amount of credits the student has
     */
    public Student(String studentName, short studentAge, int studentCredits) {
        this.setName(studentName);
        this.setAge(studentAge);
        credits = studentCredits;

    }

    /**
     * getAddress
     *
     * Get the student's address
     *
     * @return the Student's address
     */
    @Override
    public String getAddress() {
        return studentAddress;
    }

    /**
     * setAddress
     *
     * Set's the student's Address
     *
     * @param address the user's address
     */
    @Override
    public void setAddress(String address) {
        studentAddress = address;
    }

    /**
     * GPA Setter Method
     *
     * @param theGPA the new GPA
     */
    public void setGPA(int theGPA) {
        gpa = theGPA;
    }

    /**
     * GPA Getter Method
     *
     * @return the Student's GPA
     */
    public int getGPA() {
        return gpa;
    }

    // (DONE) ToDo 1: Make this class a child of Human
    // (DONE) ToDo 2: Fix the resulting errors
    // (DONE) ToDo 3: Add a field for GPA and create setter and getter
    // (DONE) ToDo 4: Add comments to your code
}
