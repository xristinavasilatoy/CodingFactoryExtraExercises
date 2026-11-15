package gr.aueb.cf.codingfactoryextraexercises.ch15.zoo;

public class Dog extends Animal implements Speakable{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("woof");
    }
}
