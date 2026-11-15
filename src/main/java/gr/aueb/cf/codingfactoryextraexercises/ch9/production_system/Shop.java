package gr.aueb.cf.codingfactoryextraexercises.ch9.production_system;
/*
Χρησιμοποίησε ιδιωτικό constructor.
Αποθήκευσε το μοναδικό αντικείμενο σε private static final πεδίο.
Η getInstance() επιστρέφει πάντα αυτό το αντικείμενο.
Πρόσθεσε μη στατικό πεδίο int salesCount.
Η μη στατική recordSale() αυξάνει τον μετρητή κατά ένα.
Η getSalesCount() επιστρέφει τον μετρητή.
 */
public class Shop {
    private static final String instance = "cup";
    int salesCount;

    private Shop() {}

    private Shop(String instance) {
    }

    public String getInstance() {
        return instance;
    }

    public void recordSale() {
        salesCount++;

    }

    public int getSalesCount() {
        return this.salesCount;
    }


}
