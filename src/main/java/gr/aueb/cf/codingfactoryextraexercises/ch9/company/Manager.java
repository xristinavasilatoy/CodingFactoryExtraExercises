package gr.aueb.cf.codingfactoryextraexercises.ch9.company;

import javax.sound.midi.Soundbank;

public class Manager extends Employee{
    private double bonus;

    public Manager(double bonus, String name, double salary) {
    super(name, salary);
    this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        super.calculatePay();
        double added = bonus + getSalary();
        return added;
    }

    @Override
    public String getRole() {
        super.getRole();
        return "Manager";
    }

    public void approveLeave() {
        System.out.println("Leave approved");
    }
}
