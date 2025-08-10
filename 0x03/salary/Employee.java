package salary;

public class Employee {
    private double fixedSalary;

    public double getFixedSalary() {
        return fixedSalary;
    }

    Employee(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    double calculateBonus(Department department) {
        if (department.reachedTarget()) {
            return fixedSalary * 10 / 100;
        }
        return 0.00;
    }

    double calculateTotalSalary(Department department) {
        double bonus = calculateBonus(department);
        return fixedSalary + bonus;
    }
}
