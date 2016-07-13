package ninja.sakib.javatutorial;

import ninja.sakib.javatutorial.sorting.Student;
import ninja.sakib.javatutorial.sorting.StudentComparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * := Coded with love by Sakib Sami on 7/13/16.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public class Main {
    public static void main(String args[]) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Sakib");
//        names.add("Lotus");
//        names.add("Ayasha");
//        names.add("Sami");
//        names.add("Nur");
//        print(names);
//
//        Collections.sort(names);    // Sorting Array
//        Utils.print("\n");
//        print(names);

//        ArrayList<Integer> names = new ArrayList<>();
//        names.add(10);
//        names.add(4);
//        names.add(100);
//        names.add(45);
//        names.add(23);
//        print(names);
//
//        Collections.sort(names);    // Sorting Array
//        Utils.print("\n");
//        print(names);

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setName("Sakib");
        student.setId("123");
        student.addMark(65);
        student.addMark(43);
        student.addMark(21);
        students.add(student);

        student = new Student();
        student.setName("Sami");
        student.setId("125");
        student.addMark(90);
        student.addMark(67);
        student.addMark(11);
        students.add(student);

        student = new Student();
        student.setName("Ayasha");
        student.setId("126");
        student.addMark(56);
        student.addMark(87);
        student.addMark(97);
        students.add(student);

        print(students);
        Collections.sort(students, new StudentComparator());
        Utils.print("\n\n");
        print(students);
    }

    public static void print(ArrayList<Student> values) {
        for (Student v : values) {
            Utils.println(v.toString() + "\n");
        }
    }

}
