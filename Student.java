// Student Class provides student's first and last name, grade and id.

public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private String studentNumber;
    private static int index = 1;

    Student(String firstName,  String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;

        studentNumber = String.format( "%03d", index++); // "%03d" prints 3 digits because student number is usually more than 1 digit
    }

    public String toString() {
        return "Name: "+ firstName + " " + lastName + "Grade: " + grade; // override to get readable texts
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
