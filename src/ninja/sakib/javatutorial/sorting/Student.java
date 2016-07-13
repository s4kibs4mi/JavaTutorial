package ninja.sakib.javatutorial.sorting;

import java.util.ArrayList;

/**
 * := Coded with love by Sakib Sami on 7/13/16.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public class Student {
    private String name;
    private String id;
    private ArrayList<Integer> marks;

    public Student() {

    }

    public Student(String name, String id, ArrayList<Integer> marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    public void addMark(int mark) {
        if (marks == null)
            marks = new ArrayList<>();
        marks.add(mark);
    }

    @Override
    public String toString() {
        String data = "Name : " + name + "\n" +
                "Id : " + id + "\n" +
                "Marks : ";
        for (Integer n : marks) {
            data += n + " ";
        }
        return data;
    }
}
