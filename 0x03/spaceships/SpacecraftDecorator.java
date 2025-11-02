package spaceships;

public class SpacecraftDecorator extends Spacecraft{
    private Spacecraft spacecraft;
    public SpacecraftDecorator(Spacecraft spacecraft){
        super(spacecraft.getHealth(), spacecraft.health);
        this.spacecraft = spacecraft;
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
