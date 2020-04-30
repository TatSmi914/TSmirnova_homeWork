package tSmirnova_hW04_all.Animals;

public class Dog extends Animals{

    public Dog(String nameDog, String breed) {
        super(nameDog, breed);
        this.animalSpecies = AnimalSpecies.OMNIVOROUS;
        this.animalFamilies = AnimalFamilies.CANINEFAMILY;
    }

    @Override
    public boolean isEatAbility() {
        return true;
    }

    @Override
    public boolean EatableAbility() {
        return false;
    }

    @Override
    public void voice() {
        System.out.println("Dog is pronounced like : \"Gaf-gaf!\"");
    }
}