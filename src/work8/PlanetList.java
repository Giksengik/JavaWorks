package work8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlanetList{

    // Находит планету с наибольшим радиусом
    public static Planet maxRadius(List<Planet> planets) {
        return Collections.min(planets);
    }

    // Находит планету с наименьшим радиусом
    public static Planet minRadius(List<Planet> planets) {
        return Collections.max(planets);
    }

    public static void shuffle(List<Planet> planets) {
        Collections.shuffle(planets);
    }

    public static void main(String[] args) {
        List<Planet> mutablePlanets = new ArrayList<>();
        mutablePlanets.add(new Planet("planet", 44));
        mutablePlanets.add(new Planet("plann", 444));
        mutablePlanets.add(new Planet("dososdfg", 434));
        List<Planet> planets = Collections.unmodifiableList(mutablePlanets);
        try {
            planets.add(new Planet("dsg", 4355));
        } catch (Exception e) {
            System.out.println("unmodifiable");
        }
        mutablePlanets.add(new Planet("dds", 3434));
        System.out.println(mutablePlanets);

        System.out.println(minRadius(mutablePlanets));
        System.out.println(maxRadius(mutablePlanets));
        shuffle(mutablePlanets);
        System.out.println(mutablePlanets);
    }
}
