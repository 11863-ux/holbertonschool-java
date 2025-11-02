package spaceships;

public class SpacecraftDecorator extends Spacecraft{
    Spacecraft spacecraftDecorated;
    public SpacecraftDecorator(Spacecraft spacecraft){
        super(spacecraft.getHealth(), spacecraft.getAttack());
        this.spacecraftDecorated = spacecraft;
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public int getAttack() {
        return super.getAttack();
    }
}
