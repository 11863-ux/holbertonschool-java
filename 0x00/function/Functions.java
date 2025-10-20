public class Functions {
    // Do only 1 thing
    // B
    public void saveIncome(Income income){
        inRepo.save(income);
    }
    public void saveExpense(Expense expense){
        outRepo.save(expense);
    }

    // Only 1 level of abstraction
    // A
    @PostMapping("/user")
    public User saveUser(User user){
        return userService.save(user);
    }

    // Arguments
    // A
    public void saveUser(User user){};

    // No side effects
    // A
    public User saveUser(User user){
        if(user.isAdmin){
            user.setRole(user);
        }
        return userRepository.save(user);
    }

    // Avoid duplicates by extracting into new methods
    // B
    public Environment getEnvironment(){
        return environmentService.getEnvironment(getVersion());
    }
    public Release getRelease(){
        return releaseService.getRelease(getVersion());
    }
    private String getVersion(){
        return versionService.getVersion();
    }

}
