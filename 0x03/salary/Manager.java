package salary;

public class Manager extends Employee {
    Manager(double fixedSalary) {
        super(fixedSalary);
    }

    @Override
    public double calculateBonus(Department department) {
        double fixedSalaryOfManager = this.getFixedSalary();
        if (department.reachedTarget()) {
            return fixedSalaryOfManager * 20 / 100 + (department.getAchievedTargetValue() - department.getTargetValue()) * 1 / 100;
        }
        return 0.00;

    }
}
