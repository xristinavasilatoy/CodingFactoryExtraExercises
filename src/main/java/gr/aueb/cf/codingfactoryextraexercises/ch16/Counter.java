package gr.aueb.cf.codingfactoryextraexercises.ch16;

public class Counter {
    private int count = 0;


    public synchronized void increment() {
        count++;
    }

}
