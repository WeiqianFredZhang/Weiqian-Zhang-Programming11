public class Main {
    public static void main(String[] args) {
        School sch = new School();


        System.out.println("Add 10 students to student list");
        for(int i=0; i<10; i++){
            Student stu = new Student("a","b",i+5); // prints student's information
            sch.addStudent(stu); // Add 10 students to student list in total
        }

        System.out.println("add 3 teachers to teacher list");
        for(int i=0; i<3; i++){
            Teacher tea = new Teacher("a"+i,"b","english"); // prints teacher's information
            sch.addTeacher(tea); // add 3 teachers to teacher list in total
        }

        // display both lists
        System.out.println("");
        sch.printTeachers();
        sch.printStudents();


        System.out.println("\n\nremove 2 students");
        Student studentDelete_1 =  sch.getStudents().get(2); // remove 1 student from School; get(2) means the second in the list
        sch.deleteStudent(studentDelete_1);

        Student studentDelete_2  =  sch.getStudents().get(5); // remove another student from School; get(5) means the 5th in the list
        sch.deleteStudent(studentDelete_2);


        System.out.println("remove 1 teacher\n");
        Teacher teaDelete = new Teacher("a1","b","english"); // remove 1 teacher
        sch.deleteTeacher(teaDelete);

        sch.printTeachers(); // display the teacher list after edit

        sch.printStudents(); // display the student list after edit
    }
}
