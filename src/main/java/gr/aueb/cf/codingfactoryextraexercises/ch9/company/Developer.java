package gr.aueb.cf.codingfactoryextraexercises.ch9.company;

public class Developer extends Employee {
    private int overtimeHours;

    public Developer(String name, double salary, int overtimeHours) {
        super(name, salary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculatePay() {
        super.calculatePay();
        double result = getSalary()+ overtimeHours * 20;
        return result;
    }

    @Override
    public String getRole() {
        // super.getRole();
         return "Developer";

    }
}
