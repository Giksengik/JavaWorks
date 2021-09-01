package work1;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name= " + name + ", age= " + this.age;
    }

    public void intoHumanAge() {
        System.out.println(this.name + "'s age in human years is "  + this.age * 7 + " years");
    }
}
