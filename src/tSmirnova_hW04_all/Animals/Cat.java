package tSmirnova_hW04_all.Animals;

public class Cat extends Animals{

    public Cat(String nameCat, String breed) {
        super(nameCat, breed);
        animalSpecies = AnimalSpecies.CARNIVOROUS;
        animalFamilies = AnimalFamilies.CATFAMILY;
    }

    @Override
    public boolean isEatAbility() {
        return true;
    }

    @Override
    public boolean eatableAbility() {
        return true;
    }

    @Override
    public void voice() {
        System.out.println("Cat is pronounced like : \"Meow-meow!\"");
    }
}