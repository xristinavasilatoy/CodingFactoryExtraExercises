package gr.aueb.cf.codingfactoryextraexercises;

import java.time.LocalDateTime;

public class SimpleBank {
    static double balance = 100;

    public static void main(String[] args) {
        double amount = -40;
        try {
            deposit(amount);
            System.out.println(balance);
        }
        catch (Exception a) {
            System.out.println(a.getMessage());
        }
        try {
            withdraw(amount);
            System.out.println(balance);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Insufficient amount");
            }

            balance += amount;
        } catch (Exception a) {
            System.err.println(LocalDateTime.now()+" "+a.getMessage());
            throw a;
        }

    }


    public static void withdraw(double amount) throws Exception {
        try {
            if (amount > balance) {
                throw new Exception("Insufficient amount");
            }
            else if (amount <= 0) {
                throw new Exception("Insufficient amount");
            }
            balance -= amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now()+" "+e.getMessage());
            throw e;
        }
    }
}

