package special_account;

import exceptions.InvalidOperationException;

public class FeeBasedBankAccount extends BasicBankAccount {

    private int transactionCount=0;
    public FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
        super(accountNumber, annualInterestRate);
    }

    @Override
    public void withdraw(double value) throws InvalidOperationException {
            super.withdraw(value);
            double balanceAfterWithdraw=getBalance()-0.10;
            setBalance(balanceAfterWithdraw);
            transactionCount++;



    }

    @Override
    public void deposit(double value) throws InvalidOperationException {
            super.deposit(value);
            double balanceAfterDeposit=getBalance()-0.10;
            setBalance(balanceAfterDeposit);
            transactionCount++;

    }

    public int getTransactionCount() {
        return transactionCount;
    }
}
