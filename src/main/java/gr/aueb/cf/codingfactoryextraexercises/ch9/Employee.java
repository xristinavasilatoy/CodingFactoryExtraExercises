package gr.aueb.cf.codingfactoryextraexercises.ch9;
/*
private int salary;
Constructor («κονστράκτορ» — κατασκευαστή) που δέχεται μισθό.
Getter («γκέτερ» — μέθοδο ανάγνωσης) του μισθού.
Setter («σέτερ» — μέθοδο ορισμού τιμής) που αποθηκεύει τον νέο μισθό μόνο
αν είναι >= 0.
 */
public class Employee {

    private int salary;
    private int account;

    public Employee(int salary){
        this.salary = salary;
    }
    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int Salary) {
        if (Salary >=0) {
            this.salary = salary;
        }
    }

}
