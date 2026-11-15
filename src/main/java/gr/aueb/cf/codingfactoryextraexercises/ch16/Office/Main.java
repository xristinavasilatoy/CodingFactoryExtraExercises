package gr.aueb.cf.codingfactoryextraexercises.ch16.Office;

public class Main {

    public static void main(String[] args) {
        Photo photos = new Photo();
        //photos.print();


        Document documents = new Document();
        //documents.print();

        Thread docThread = new Thread(documents::print);
        Thread photoThread = new Thread(photos::print);

        docThread.start();
        photoThread.start();

        try{
            photoThread.join();
            docThread.join();


            System.out.println("All printing finished");


        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("η ροή διακόπηκε");;
        }


    }
}
