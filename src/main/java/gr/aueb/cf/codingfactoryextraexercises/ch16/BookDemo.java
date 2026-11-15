package gr.aueb.cf.codingfactoryextraexercises.ch16;

public class BookDemo {

    public static void main(String[] args) {
        Book.Builder hp = new Book.Builder("html");
        hp.info();

        Book.Builder helper = new Book.Builder("JAVA");
        helper.pages(300);

        Book book = helper.build();

        System.out.println(book.getTitle()+", "+book.getPages());
    }
}
