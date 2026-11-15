package gr.aueb.cf.codingfactoryextraexercises.ch16.Coffee_Orders;

public class CoffeeDemo {

    public static void main(String[] args) {



    Coffee.Builder lm = new Coffee.Builder("latte maciatto");

    lm.sugar(2);

    Coffee coffeeOriginal = lm.build();
}
}
