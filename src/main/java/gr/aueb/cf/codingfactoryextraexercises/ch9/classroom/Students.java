package gr.aueb.cf.codingfactoryextraexercises.ch9.classroom;

public class Students {
    private String Name;
    private int grade;
    private Course course;

    private Students() {}

    private Students(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public static Students createANewStudent(String name) {
        return new Students(name);
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse(){
        return course;
    }
}
