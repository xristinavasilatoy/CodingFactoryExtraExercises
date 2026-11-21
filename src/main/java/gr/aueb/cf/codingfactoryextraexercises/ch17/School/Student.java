package gr.aueb.cf.codingfactoryextraexercises.ch17.School;

public class Student implements Comparable<Student> {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;

    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

}
