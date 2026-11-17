package gr.aueb.cf.codingfactoryextraexercises.ch17;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.insertFirst("Τυρί");
        list.insertFirst("Αυγά");
        list.insertFirst("Γάλα");
        list.printAll();

        System.out.println(list.contains("Τυρί"));

    }
}
