package gr.aueb.cf.codingfactoryextraexercises.ch16;

public class ThreadsDem {
    public static void main (String[] args) throws InterruptedException {

        Runnable task = () -> {
            for (int i = 0; i <= 3; i++) {
                System.out.println("Worker "+i);
            }
        };
        Thread worker = new Thread(task);
        worker.start();

        System.out.println("Main continues");

        worker.join();

        System.out.println("Worker finished");


//        for(int i =0; i <= 3; i++){
//            System.out.println("Main "+i);
        }



    }

