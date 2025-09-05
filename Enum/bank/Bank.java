package bank;

import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Branch> branches;

    Bank(String name){
        this.name = name;
        this.branches= new ArrayList<>();
    }

    public Branch findBranch(String branchName){
        branches.forEach(branch->{
            if(branchName==branch.name) return branch;
        });
        return null;
    }
}
