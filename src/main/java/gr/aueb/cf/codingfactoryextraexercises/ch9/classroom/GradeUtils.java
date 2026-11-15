package gr.aueb.cf.codingfactoryextraexercises.ch9.classroom;

public class GradeUtils {
    int grade;

    private GradeUtils() {

    }

    public static boolean isPassed(int grade) {
        if (grade >= 5) {
            return true;

        }
        return false;
    }
}
