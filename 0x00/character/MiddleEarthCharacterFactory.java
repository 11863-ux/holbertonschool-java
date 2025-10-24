package character;

public class MiddleEarthCharacterFactory extends CharacterFactory {
    @Override
    Character createCharacter(CharacterType characterType, String name) {
        if(characterType.name().equals("MAGE")){
            return new Mage(name,10,2,5,3,4);
        }
        else if(characterType.name().equals("THIEF")){
            return new Thief(name,2,6,8,5,10);
        }
        return new Warrior(name,1,8,5,10,6);
    }
}
