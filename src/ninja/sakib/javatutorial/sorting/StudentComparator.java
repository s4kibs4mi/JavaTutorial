package ninja.sakib.javatutorial.sorting;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * := Coded with love by Sakib Sami on 7/13/16.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return count(o2.getMarks()) - count(o1.getMarks());
    }

    public int count(ArrayList<Integer> values) {
        int total = 0;
        for (Integer n : values) {
            total += n;
        }
        return total;
    }
}
