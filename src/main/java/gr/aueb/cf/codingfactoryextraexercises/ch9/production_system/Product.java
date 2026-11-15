package gr.aueb.cf.codingfactoryextraexercises.ch9.production_system;
/*
Κάθε προϊόν έχει String name και double price.
- Εφάρμοσε τους κανόνες αμεταβλητότητας του μαθήματος.
- Πρόσθεσε ιδιωτικό constructor που αρχικοποιεί τα πεδία.
- Πρόσθεσε getters («γκέτερς» — μεθόδους ανάγνωσης).
- Πρόσθεσε δύο static factory methods («στάτικ φάκτορι μέθοντς» — στατικές μεθόδους παραγωγής αντικειμένων):
  - of(String name, double price): επιστρέφει νέο προϊόν με αυτά τα στοιχεία.
  - free(String name): επιστρέφει νέο προϊόν με τιμή 0.
Για απλότητα, θεώρησε ότι οι παράμετροι είναι έγκυρες.
 */
public final class Product {

   private String name;
    private double price;

    private Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return price;
    }

    public static Product of(String name, double price) {
        return new Product(name, price);
    }

    static Product free(String name) {
        return new Product(name, 0);
    }

}
