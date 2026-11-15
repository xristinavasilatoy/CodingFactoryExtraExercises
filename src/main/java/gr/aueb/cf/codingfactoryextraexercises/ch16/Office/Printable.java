package gr.aueb.cf.codingfactoryextraexercises.ch16.Office;

public interface Printable {

    default void print() {
        System.out.println("Printing...");
    }
}
