package work7;

import java.util.HashMap;
import java.util.Map;

public class PetTest {

    private static HashMap<String, Pet> pets = new HashMap<>();

    private static void initPets() {
        pets.put("BOBA", new Dog(19, 0.1));
        pets.put("karp", new Cat(55, 55.5));
        pets.put("a ya dumala sova", new Owl(3, 5.55));
    }

    private static void printPets() {
        for (Map.Entry<String, Pet> petEntry : pets.entrySet()) {
            System.out.println(petEntry.getKey() + " " + petEntry.getValue().getAge()
                    + " " + petEntry.getValue().getWeight());
        }
    }

    public static void main(String[] args) {
        initPets();
        printPets();
        pets.put("ABOBA", new Owl(5, 5.44));
        pets.put("ggg", new Cat(55, 52.5));
        printPets();
    }
}
