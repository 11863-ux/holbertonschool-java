import java.util.UUID;

public class SalaryService {

    private SalaryCalculatorService calculator = SalaryCalculatorService.getInstance();

    public void calculate(double grossSalary, double discountValue, double salesValue, double commissionPercentage){
        calculator.calculateNetSalary(grossSalary, discountValue, salesValue, commissionPercentage);
    }

    public UUID getUuid(){
        return calculator.uuid;
    }
}
