// Teacher Class provides teacher's first and last name and the subject he/she teaches

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    Teacher(String firstName,  String lastName,  String subject){
        this.firstName = firstName; // the 'this' keyword refers to the instance variable of the Class (in this case, 'firstName')
        this.lastName = lastName;
        this.subject = subject;
    }

    public String toString() { // override the existing method to apply more meanings
        return "Name: "+ firstName + " " + lastName + "Subject: " + subject;
    }// often when we need a proper output in println, we return a text representation of the object or Class like the one above

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
