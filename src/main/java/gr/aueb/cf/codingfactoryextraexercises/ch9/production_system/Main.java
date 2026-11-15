package gr.aueb.cf.codingfactoryextraexercises.ch9.production_system;

/*
Γράψε κώδικα που:
1. Δημιουργεί δύο διαφορετικά προϊόντα με Product.of("Book", 100) και ένα δωρεάν με Product.free("Gift").
2. Υπολογίζει και εμφανίζει την τιμή του πρώτου προϊόντος μετά από έκπτωση 20%.
3. Εμφανίζει ξανά την αρχική τιμή του προϊόντος, ώστε να φανεί ότι δεν άλλαξε.
4. Παίρνει δύο αναφορές shop1, shop2 με Shop.getInstance().
5. Καλεί μία φορά τη recordSale() μέσω κάθε αναφοράς.
6. Εκτυπώνει:
System.out.println(product1 == product2);
System.out.println(shop1 == shop2);
System.out.println(shop1.getSalesCount());
System.out.println(shop2.getSalesCount());
 */
public class Main {

    static void main() {

        Product product1 = Product.of("title",50);
        Product product2 = Product.of("Book", 100);
        Product gift = Product.free("pen");
        Product.of("Book", 100);
        Product.free("Gift");

        PriceUtils.applyDiscount(100, 20);

//        Product productPrice = Product1.getPrice;
//
//        Shop shop1 = Shop.getInstance();
//        Shop shop2 = Shop.getInstance();
//
//        shop1.recordSale();
//        shop2.recordSale();
//
//        System.out.println(product1 == product2);
//        System.out.println(shop1 == shop2);
//        System.out.println(shop1.getSalesCount());
//        System.out.println(shop2.getSalesCount());


    }
}
