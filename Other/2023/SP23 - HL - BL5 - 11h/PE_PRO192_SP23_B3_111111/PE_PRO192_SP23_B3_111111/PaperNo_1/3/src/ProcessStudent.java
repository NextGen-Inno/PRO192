
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class ProcessStudent {

    public void sortStudent(List<Student> l) {
        //TODO: you should do sort list l here
        Collections.sort(l, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.name.compareTo(o2.name);
                if (result == 0) {
                    result = (int) (o1.gpa - o2.gpa);
                }
                return result;
            }
        });
    }

    public List<Student> find_by_partial_name(List<Student> l, String letter) {
        ArrayList<Student> filteredL = new ArrayList();
        //TODO: you should return filtered List of student by name here
        for (Student s : l) {
            if (s.name.contains(letter)) {
                filteredL.add(s);
            }
        }
        return filteredL;
    }

    public List<Student> find_higher_gpa(List<Student> l, int gpa) {
        ArrayList<Student> filteredL = new ArrayList();
        //TODO: you should filter whose gpa are higher than given gpa here
        for (Student student : l) {
            if (student.gpa > gpa) {
                filteredL.add(student);
            }
        }
        return filteredL;
    }
}
