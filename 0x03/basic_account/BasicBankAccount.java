package basic_account;

import basic_account.exceptions.InvalidOperationException;

public class BasicBankAccount {
    private String accountNumber;
    private double balance = 0;
    private double annualInterestRate;

    public BasicBankAccount(String accountNumber, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.annualInterestRate = annualInterestRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void deposit(double value) throws InvalidOperationException {
        if (value > 0) {
            balance += value;
        } else throw new InvalidOperationException("Deposit amount must be greater than 0");
    }

    void withdraw(double value) throws InvalidOperationException {
        if (value < 0) {
            throw new InvalidOperationException("Withdrawal amount must be less than the current balance");
        } else if (value > balance) {
            throw new InvalidOperationException("Withdrawal amount must be less than the current balance");
        } else balance -= value;
    }

    double calculateMonthlyFee() {
        double percentageFee = balance * 10 / 100;
        return Math.min(percentageFee, 10.00);
    }

    double calculateMonthlyInterest() {
        if (balance <= 0) {
            return 0;
        } else {
            double monthlyInterest = annualInterestRate / 12;
            return balance * monthlyInterest / 100;
        }
    }

    void applyMonthlyUpdate() {
        balance = balance - calculateMonthlyFee() + calculateMonthlyInterest();
    }
}
