package _0_initialData;

import java.util.ArrayList;
import java.util.List;

public class InitialStudents {

    public static Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
    public Student student2 = new Student("Nikolay", 'm', 28, 2, 6.4);
    public Student student3 = new Student("Elena", 'f', 19, 1, 8.9);
    public Student student4 = new Student("Petr", 'm', 35, 4, 7);
    public static Student student5 = new Student("Mariya", 'f', 23, 3, 7.4);

    void studentAdd() {
    List <Student> studentList = new ArrayList<>();
    //studentList.add(InitialStudents.student1);
    studentList.add(student1);
    studentList.add(student2);
    studentList.add(student3);
    studentList.add(student4);
    studentList.add(student5);
    }
}

