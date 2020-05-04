package tSmirnova_hW04_all.Animals;

public class Mouse extends Animals {

    public Mouse(String nameMouse, String breed) {
        super(nameMouse, breed);
        animalSpecies = AnimalSpecies.HERBIVOROUS;
        animalFamilies = AnimalFamilies.MOUSEFAMILY;
    }

    @Override
    public boolean isEatAbility() {
        return false;
    }

    @Override
    public boolean eatableAbility() {
        return true;
    }

    @Override
    public void voice() {
        System.out.println("Mouse is pronounced like : \"Pee-pee-pee!\"");
    }
}