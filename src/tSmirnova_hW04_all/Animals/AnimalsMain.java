package tSmirnova_hW04_all.Animals;

public class AnimalsMain {

    public static void main(String[] args) {

        Animals myCat = new Cat("cat", "persian");
        Animals myDog = new Dog("dog", "mastiff");
        Animals myMouse = new Mouse("mouse", "fuzz");

        myCat.animalInfo();
        myMouse.animalInfo();
        myDog.animalInfo();
        System.out.println();

        myCat.voice();
        myMouse.voice();
        myDog.voice();
        System.out.println();

        System.out.println(myCat.isMoveAbility() ? "Animal is moving!" : "Animal is NOT moving!");
        System.out.println(myMouse.isMoveAbility() ? "Animal is moving!" : "Animal is NOT moving!");
        System.out.println(myDog.isMoveAbility() ? "Animal is moving!" : "Animal is NOT moving!");

        myCat.eat(myMouse);
        myCat.eat(myDog);
        myDog.eat(myCat);
        myCat.eat(myCat);
        myDog.eat(myDog);
    }
}