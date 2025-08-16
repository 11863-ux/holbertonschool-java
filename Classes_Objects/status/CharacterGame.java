public class CharacterGame {
    private int currentHealth;
    private String name;
    private String status;

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
        status=currentHealth>0 ? "alive" : "dead";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damageAmount){
        currentHealth -= damageAmount;
        if(currentHealth <= 0){
            currentHealth = 0;
        }
        setCurrentHealth(currentHealth);
    }

    public void receiveHealing(int healingAmount){
        currentHealth += healingAmount;
        if(currentHealth >= 100){
            currentHealth = 100;
        }
        setCurrentHealth(currentHealth);
    }

    public String getStatus() {
        return status;
    }
}
