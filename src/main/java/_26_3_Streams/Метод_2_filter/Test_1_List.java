package _26_3_Streams.Метод_2_filter;

import _0_initialData.InitialStudents;
import _0_initialData.Student;


import java.util.ArrayList;
import java.util.List;

public class Test_1_List {
    public static void main(String[] args) {
        InitialStudents initialStudents = new InitialStudents();
        Student student1 = _0_initialData.InitialStudents.student1;
        Student student2 = initialStudents.student2;
        Student student3 = initialStudents.student3;
        Student student4 = initialStudents.student4;
        Student student5 = _0_initialData.InitialStudents.student5;

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        System.out.println(studentList);
        studentList.set(0,new Student("IVan", 'm', 22, 3, 8.3));
        System.out.println(studentList);
    }
}
