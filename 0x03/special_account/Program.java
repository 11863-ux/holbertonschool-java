package special_account;

public class Program {
    public static void main(String[] args) {
        try {
            FeeBasedBankAccount account1 = new FeeBasedBankAccount("AAA", 30.0);
            System.out.println(String.format("Account %s - balance: %.2f", account1.getAccountNumber(), account1.getBalance()).replace('.', ','));
            account1.deposit(125);
            System.out.println(String.format("Account %s - balance: %.2f", account1.getAccountNumber(), account1.getBalance()).replace('.', ','));
            account1.withdraw(30);
            System.out.println(String.format("Account %s - balance: %.2f", account1.getAccountNumber(), account1.getBalance()).replace('.', ','));
            account1.deposit(10);
            System.out.println(String.format("Account %s - balance: %.2f", account1.getAccountNumber(), account1.getBalance()).replace('.', ','));
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            ControlledBankAccount account2 = new ControlledBankAccount("BBB", 30.0, 20, 5);
            System.out.println(String.format("Account %s - balance: %.2f", account2.getAccountNumber(), account2.getBalance()).replace('.', ','));
            account2.deposit(125);
            System.out.println(String.format("Account %s - balance: %.2f", account2.getAccountNumber(), account2.getBalance()).replace('.', ','));
            account2.withdraw(105);
            System.out.println(String.format("Account %s - balance: %.2f", account2.getAccountNumber(), account2.getBalance()).replace('.', ','));
            account2.applyMonthlyUpdate();
            System.out.println(String.format("Account %s - balance: %.2f", account2.getAccountNumber(), account2.getBalance()).replace('.', ','));
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            ControlledBankAccount account3 = new ControlledBankAccount("CCC", 30.0, 20, 5);
            System.out.println(String.format("Account %s - balance: %.2f", account3.getAccountNumber(), account3.getBalance()).replace('.', ','));
            account3.deposit(125);
            System.out.println(String.format("Account %s - balance: %.2f", account3.getAccountNumber(), account3.getBalance()).replace('.', ','));
            account3.withdraw(106);
            System.out.println(String.format("Account %s - balance: %.2f", account3.getAccountNumber(), account3.getBalance()).replace('.', ','));
            account3.applyMonthlyUpdate();
            System.out.println(String.format("Account %s - balance: %.2f", account3.getAccountNumber(), account3.getBalance()).replace('.', ','));
            System.out.println();
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }
    }
}
