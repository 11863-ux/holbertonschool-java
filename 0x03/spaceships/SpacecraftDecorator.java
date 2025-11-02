package spaceships;

public class SpacecraftDecorator extends Spacecraft{
    Spacecraft spacecraft;
    public SpacecraftDecorator(Spacecraft spacecraft){
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
