package gr.aueb.cf.codingfactoryextraexercises.ch17.School;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student ("maria", 7));
        students.add(new Student("nikos", 4));
        students.add(new Student("dion", 8));
        students.add(new Student("nicki", 4));

        Collections.sort(students);
        for (Student u : students) {
            System.out.println(u.name+", "+u.grade);

        }


    }
}
