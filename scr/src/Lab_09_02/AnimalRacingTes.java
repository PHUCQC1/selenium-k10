package Lab_09_02;

import java.util.Arrays;
import java.util.List;

public class AnimalRacingTes {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setName("lulu");
        Animal horse = new Horse();
        horse.setName("mama");
        Animal tiger = new Tiger();
        tiger.setName("hoho");

        List<Animal> animalList = Arrays.asList(dog, horse, tiger);
        AnimalController controller = new AnimalController();
        controller.getWinner(animalList);
    }
}
