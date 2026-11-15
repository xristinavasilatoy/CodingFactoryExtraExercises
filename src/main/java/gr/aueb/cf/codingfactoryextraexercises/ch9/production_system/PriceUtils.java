package gr.aueb.cf.codingfactoryextraexercises.ch9.production_system;
/*
Απαγόρευσε τη δημιουργία αντικειμένων από άλλες κλάσεις.
Γράψε public static double applyDiscount(double price, double percent).
Η μέθοδος επιστρέφει την τιμή μετά την έκπτωση. Για παράδειγμα, 100, 20 δίνει 80.
Δεν αποθηκεύει τιμές σε πεδία.
 */
public class PriceUtils {

    private PriceUtils() {

    }

    public static double applyDiscount (double price, double percent) {
        double newPrice = price / 100;
        double result = newPrice * percent;
        return price - result;
    }
}
