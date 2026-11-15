package gr.aueb.cf.codingfactoryextraexercises.ch9.classroom;
public class Main1 {



    public static void main(String[] args) {

Course course = new Course("JAVA");
Students student1 = Students.createANewStudent("Anna");
Students students2 = Students.createANewStudent("Nikos");
student1.setCourse(course);
students2.setCourse(course);
student1.setGrade(8);
students2.setGrade(4);
School dimotiko = School.getINSTANCE();
        dimotiko.registerStudent();
        dimotiko.registerStudent();

        System.out.println(student1.getName()+","+student1.getCourse().getTitle()+","+student1.getGrade()+","+GradeUtils.isPassed(student1.getGrade()));
        System.out.println(students2.getName()+","+students2.getCourse().getTitle()+","+ students2.getGrade()+","+GradeUtils.isPassed(students2.getGrade()));
        System.out.println("Έγγραφές: "+dimotiko.getRegisterCounter());
//        Students student1 = new Students("Pal");
//        Students student2 = new Students("Dan");
//        Students student3 = student1;
//        Students student4 = Students.createANewStudent("Haris");
//        student4.setGrade(7);
//        boolean didstudent4pass = GradeUtils.isPassed(student4.getGrade());
//        System.out.println(student4.getName()+", "+ student4.getGrade()+", "+ didstudent4pass);
//        String savedName = student4.getName();
//
//        student4.setName("Kea");
//
//
//
//        boolean grades = GradeUtils.isPassed(5);
//
//        Course course = new Course("JAVA");
//        student4.setCourse("javascript");
//        System.out.println(course.getTitle());
//
//
//        School ours= School.getINSTANCE();
//        ours.registerStudent();
//        ours.registerStudent();
//        System.out.println(ours.getRegisterCounter());
//        System.out.println(ours);
//        student2.setName("Mark");
//        student3.setName("Anni");
//
//        System.out.println(student1.getName());
//        System.out.println(student2.getName());
//        System.out.println(student3.getName());
//        System.out.println(savedName);
//        System.out.println(student4.getName());
//        System.out.println(grades);


    }
}
