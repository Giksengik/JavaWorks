package work1;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Doggy dog", 5);
        System.out.println(dog);
        dog.intoHumanAge();
        dog.setAge(2);
        dog.intoHumanAge();
        dog.setName("Bobik");
        System.out.println(dog);
    }
}
