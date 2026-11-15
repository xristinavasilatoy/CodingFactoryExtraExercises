package gr.aueb.cf.codingfactoryextraexercises.ch9.classroom;

public class School {
    private  int registerCounter = 0;
    private School(){

 }
    private static final School INSTANCE = new School();

    public static School getINSTANCE() {
        return INSTANCE;
    }

    public int getRegisterCounter() {
        return registerCounter;
    }

    public void registerStudent() {
        registerCounter++;
    }

}
