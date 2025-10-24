public class WarriorBuilder implements Builder {
    String name;
    CharacterType type;
    int intelligence;
    int strength;
    int endurance;
    int resilience;
    int dexterity;


    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(CharacterType type) {
        this.type = type;
    }

    @Override
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    @Override
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public void setResilience(int resilience) {
        this.resilience = resilience;
    }

    public Warrior build(){
        return new Warrior(name,intelligence,strength,endurance,resilience,dexterity);
    }
}
