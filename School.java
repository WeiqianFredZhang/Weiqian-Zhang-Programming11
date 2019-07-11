// School Class holds three lists: Teacher, Student, and Courses

import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>(); //initialize an empty ArrayList of the class Student
    private ArrayList<String> Courses = new ArrayList<>();

    public boolean addTeacher(Teacher tea){ // create the addTeacher instance
        teachers.add(tea); // add teacher to the Teacher's ArrayList
        return true;
    }

    public boolean addStudent(Student stu){ //
        students.add(stu);
        return true;
    }

    public boolean deleteTeacher(Teacher tea){
        for(Teacher obj : teachers){ // this line of code means: for each obj(teacher object) in teachers(array)
            if(obj.toString().equals(tea.toString())){ // by comparing the 2 variables, we can delete a specific teacher from the list
                teachers.remove(obj);
                break;
            }
        }
        return true;
    }

    public boolean deleteStudent(Student stu){
        for(Student obj: students){ // iterate the ArrayList of students
            if(obj.getStudentNumber().equals(stu.getStudentNumber())){
                students.remove(obj);
                break;
            }
        }
        return true;
    }

    public void  printTeachers(){
        for(Teacher obj: teachers) { // prints every teacher in the teachers array
            System.out.println(obj);
        }
    }

    public void printStudents(){
        for(Student obj: students) {
            System.out.println(obj);
        }
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<String> getCourses() {
        return Courses;
    }

    public void setCourses(ArrayList<String> courses) {
        Courses = courses;
    }

}
