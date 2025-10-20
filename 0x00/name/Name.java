public class Name {
    // Self-explanatory variables
    // A
    public Date modifiedDate;
    public List<Testcase> findAllTestcasesByUser(Name.User user){};

    // Correct Declarations
    // A
    public List<Account> AccountList;

    // No Prefixes
    // B
    public void deleteUser(Name.User user){};

    // Avoid mental mapping
    // B
    public URL url;

    // Class names should be nouns, functions should have verbs
    // A
    public class TableRepresent {};
    public void saveCar(){};
    // One word per concept
    // B
    public saveUser(){}; createAccount(){}; generateContract(){};

    // Use constants or enums instead of magic numbers or abbreviations
    // B
    public final int DAYS_IN_YEAR = 360;
    public final int HOURS_IN_WEEK = 168;
}