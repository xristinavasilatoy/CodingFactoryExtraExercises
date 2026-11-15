package gr.aueb.cf.codingfactoryextraexercises.ch9;
/*
Διαβάζει το αρχείο με Files.readAllLines() και UTF-8.
Χωρίζει κάθε γραμμή με split(",").
Μετατρέπει τον βαθμό σε int, χρησιμοποιώντας Integer.parseInt().
Εμφανίζει όνομα, βαθμό και αν πέρασε. Βάση: 5.
Στο τέλος εμφανίζει πόσοι πέρασαν.
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadGrades {
    static Path path = Path.of("C:\\Users\\xrist\\Desktop\\coding factory new" +
            "\\Προγραμματισμός με Java\\9. Είσοδος Έξοδος δεδομένων από αρχεία\\grades.txt");
    static Path output = Path.of("C:\\Users\\xrist\\Desktop\\coding factory new\\Προγραμματισμός " +
            "με Java\\9. Είσοδος Έξοδος δεδομένων από αρχεία\\passed_grades.txt");

    public static void main(String[] args) {
        int count = 0;
        int countPasses = 0;
        try {
            StringBuilder passed = new StringBuilder();
            for (String x : Files.readAllLines(path)) {
                //Files.createFile(output);

                count++;
                String[] splitting = x.split(",");
                System.out.println(splitting[0]);
                System.out.println(splitting[1]);

                int grade = Integer.parseInt(splitting[1]);
                if (grade >= 5) {
                    passed.append(splitting[1]).append("\n");
                    System.out.println("You pass!");
                    countPasses++;
                    try {
                        String passedToBeWritten = passed.toString();
                        Files.writeString(output, passedToBeWritten);
                        System.out.println("Its written on the notebook!");
                    }
                    catch (Exception a) {
                        System.out.println("We couldn't write on notebook.");
                    }
                }
                else {
                    System.out.println("failed this time");
                }
            }
        }
        catch (IOException e){
                System.err.println(e.getMessage());
            }
        System.out.printf("Passed %d from %d", countPasses, count);
    }
}
