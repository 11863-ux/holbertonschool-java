package spaceships;

public class Spacecraft {
    int health;
    int attack;

    public Spacecraft(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }


    @Override
    public String toString() {
        return String.format("Health: %d - Attack: %d",getHealth(),getAttack());
    }
}
