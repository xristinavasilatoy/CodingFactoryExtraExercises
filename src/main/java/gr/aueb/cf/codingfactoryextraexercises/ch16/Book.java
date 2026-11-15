package gr.aueb.cf.codingfactoryextraexercises.ch16;

public class Book {

    private final String title;
    private final int pages;

    private Book(Builder builder) {
        this.title = builder.title;
        this.pages = builder.pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    

    public static class Builder {

        private final String title;
        private  int pages =0;

        public Builder(String title) {
            this.title = title;
        }

        public Builder pages(int pages) {
            this.pages = pages;
            return this;
        }


        public static void info() {
            System.out.println("I'll BUILD a book");
        }

        public Book build() {
            return new Book(this);
        }


    }
}
