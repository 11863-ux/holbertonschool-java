package bank;

import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Branch> branches;

    Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName) {
        Branch hasBranch = findBranch(branchName);
        if (hasBranch == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                if (branch.findCustomer(customerName) != null) {
                    return false;
                } else {
                    branch.customers.add(new Customer(customerName, initialTransaction));
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        for (Branch branch : branches) {
            if (findBranch(branch.getName()) != null) {
                if (branch.findCustomer(customerName) != null) {
                    Customer customer = branch.findCustomer(customerName);
                    customer.addTransaction(transaction);
                    return true;
                } else return false;
            }
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean prints_transactions) {
        Branch hasBranch = findBranch(branchName);
        if (hasBranch != null) {
            for (int i = 0; i < hasBranch.customers.size(); i++) {
                System.out.printf("Client: %s [%d]\n", hasBranch.customers.get(i).getName(), i + 1);
                if (prints_transactions) {
                    for (int j = 0; j < hasBranch.customers.get(i).transactions.size(); j++) {
                        System.out.printf("  [%d] value %.2f\n", j + 1, hasBranch.customers.get(i).transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
