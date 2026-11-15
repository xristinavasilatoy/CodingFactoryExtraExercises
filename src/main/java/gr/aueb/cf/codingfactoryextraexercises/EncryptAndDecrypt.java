package gr.aueb.cf.codingfactoryextraexercises;

import java.util.Scanner;
/*
Για να μείνουμε στο ουσιαστικό, δέξου μόνο κεφαλαία λατινικά γράμματα και κενά:
- Η encrypt() μετακινεί κάθε γράμμα ένα βήμα: A → B, με Z → A.
- Η decrypt() κάνει το αντίστροφο: B → A, με A → Z.
- Τα κενά παραμένουν ίδια.
- Χρησιμοποίησε for, charAt() και StringBuilder.
- Στη main() έλεγξε ότι "JAVA Z" γίνεται "KBWB A" και επιστρέφει στο αρχικό κείμενο με αποκρυπτογράφηση και equals().
 */

public class EncryptAndDecrypt {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter latin and CAPITAL");
        String text = scanner.nextLine();
        String encrypted = encrypt(text);
        String decrypted = decrypt(encrypted);
        System.out.println(encrypted);
        System.out.println(decrypted);
        System.out.println(text.equals(decrypted));
    }

    public static String encrypt(String text) {
        StringBuilder ok = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                ok.append(' ');
            }
            else if (text.charAt(i) == 'Z') {
                ok.append('A');
            }
            else {
                char ch = text.charAt(i);
                char next = (char) (ch + 1);
                ok.append(next);
            }

        }
        return ok.toString();
    }
    public static String decrypt(String text) {
        StringBuilder ok = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'A') {
                ok.append('Z');
            }
            else if (text.charAt(i) == ' ') {
                ok.append(' ');
            }
            else {
                char next = (char) (text.charAt(i) -1);
                ok.append(next);
            }
        }
        return ok.toString();
    }

}
