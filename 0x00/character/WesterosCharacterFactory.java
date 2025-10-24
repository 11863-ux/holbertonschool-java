package character;

public class WesterosCharacterFactory extends CharacterFactory {
    @Override
    Character createCharacter(CharacterType characterType, String name) {
        if(characterType.name().equals("MAGE")){
            return new Mage(name,8,3,3,3,4);
        }
        else if(characterType.name().equals("THIEF")){
            return new Thief(name,1,8,7,7,10);
        }
        return new Warrior(name,0,9,7,10,7);
    }
}
