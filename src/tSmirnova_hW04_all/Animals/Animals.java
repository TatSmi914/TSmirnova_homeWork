package tSmirnova_hW04_all.Animals;

public abstract class Animals implements IAnimalsRelations{

    protected AnimalFamilies animalFamilies;
    protected AnimalSpecies animalSpecies;
    protected String breed;
    protected String name;

    protected AnimalFamilies getAnimalFamilies() {
        return animalFamilies;
    }

    protected AnimalSpecies getAnimalSpecies() {
        return animalSpecies;
    }

    protected String getBreed() {
        return breed;
    }

    protected Animals(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    protected boolean isMoveAbility() {
        return true;
    }

    protected String getName() {
        return name;
    }

    protected void eat(Animals animal) {
        if (this.equals(animal)){
            System.out.printf("\n%s CAN'T eat itself", this.getName());
            return;
        }
        if (isEatAbility()){
            if (animal.eatableAbility() && !animal.animalFamilies.equals(this.animalFamilies)){
                System.out.printf("\n%s eat %s", this.getName(), animal.getName());
            } else {
                System.out.printf("\n%s CAN'T be eatable by %s", animal.getName(), this.getName());
            }
        } else {
            System.out.printf("\nSorry, %s CAN'T eat anybody", this.getName());
        }
    }

    protected void animalInfo () {
        System.out.printf("\nThis animal's name is %s and it belongs to %s and %s and %s", this.getName(), this.getBreed(),
                this.getAnimalSpecies(), this.getAnimalFamilies());
    }
}