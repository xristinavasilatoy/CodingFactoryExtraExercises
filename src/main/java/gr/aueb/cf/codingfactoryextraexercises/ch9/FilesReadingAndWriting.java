package gr.aueb.cf.codingfactoryextraexercises.ch9;
/*
1. Διαβάζει το αρχείο με Files.readAllLines() και UTF-8. Μπορείς να διατρέξεις το αποτέλεσμα απευθείας με enhanced for (ενχάνστ φορ, ενισχυμένη επανάληψη).
2. Χρησιμοποιεί split(",") και StringBuilder για να σχηματίσει:
Τοποθεσία: Αθήνα | Latitude: 37.9838 | Longitude: 23.7275
Τοποθεσία: Πάτρα | Latitude: 38.2466 | Longitude: 21.7346

Latitude (λάτιτιουντ) = γεωγραφικό πλάτος· Longitude (λόντζιτιουντ) = γεωγραφικό μήκος.
3. Δημιουργεί τον φάκελο output και γράφει το αποτέλεσμα στο output/report.txt, αντικαθιστώντας την προηγούμενη αναφορά.
4. Βάζει την επεξεργασία στη μέθοδο:
public static void createReport(Path input, Path output)
        throws IOException

5. Στη main() χειρίζεται την IOException και εμφανίζει μήνυμα επιτυχίας μόνο εφόσον ολοκληρωθεί η εγγραφή.
 */
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesReadingAndWriting {
    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

     Path input = Path.of("C:\\Users\\xrist\\Desktop\\coding " +
            "factory new\\Προγραμματισμός με Java\\9. Είσοδος Έξοδος δεδομένων από αρχεία\\locations.txt");
        System.out.println("Δοκιμή: Αθήνα");
          try {
        for (String x : Files.readAllLines(input, StandardCharsets.UTF_8)) {
                  String[] parts = x.split(",");
            System.out.println("Τοποθεσία: " + parts[0]
                    + " | Latitude: " + parts[1]
                    + " | Longitude: " + parts[2]);
              }
        }
          catch (IOException e) {
            System.err.println("didn't read"+ e.getMessage());
        }
    }


}

