package gr.aueb.cf.codingfactoryextraexercises.ch15.zoo;

public interface Speakable {
    void speak();

    default void info() {
        System.out.println("I can speak");
    }
}
