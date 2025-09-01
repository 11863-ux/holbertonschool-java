package special_account;

import exceptions.InvalidOperationException;

public class BasicBankAccount {
    private String accountNumber;
    private double balance=0;
    private double annualInterestRate;

    public BasicBankAccount(String accountNumber, double annualInterestRate)
    {
        this.accountNumber=accountNumber;
        this.annualInterestRate=annualInterestRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void deposit(double value) throws InvalidOperationException {
        if(value>0){
            balance+=value;
        } else throw new InvalidOperationException("Deposit amount must be greater than 0");
    }

    public void withdraw(double value) throws InvalidOperationException {
        if(value<0){
            throw new InvalidOperationException("Withdrawal amount must be greater than 0");
        }
        else if(value>balance){
            throw new InvalidOperationException("Withdrawal amount must be less than balance");
        }else balance-=value;
    }

    public double calculateMonthlyFee(){
        double percentageFee=balance*10/100;
        return Math.min(percentageFee, 10.00);
    }

    public double calculateMonthlyInterest(){
        if(balance<=0){
            return 0;
        }else{
            double monthlyInterest=annualInterestRate/12;
            return balance*monthlyInterest/100;
        }
    }

    public void applyMonthlyUpdate(){
        balance=balance-calculateMonthlyFee()+calculateMonthlyInterest();
    }
}
