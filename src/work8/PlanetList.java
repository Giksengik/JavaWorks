package work8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PlanetList {

    protected List<Planet> planets;

    public PlanetList() {
    }

    public PlanetList(List<Planet> planets) {
        this.planets = planets;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public PlanetList add(Planet toAdd) {
        List<Planet> listCopy = new ArrayList<>();
        Collections.copy(planets, listCopy);
        listCopy.add(toAdd);
        return new PlanetList(listCopy);
    }

    public PlanetList remove(int index) {
        List<Planet> listCopy = new ArrayList<>();
        Collections.copy(planets, listCopy);
        listCopy.remove(index);
        return new PlanetList(listCopy);
    }

    public Planet pickRandom() {
        if(planets.size() > 0) {
            Random rand = new Random();
            int next = rand.nextInt(planets.size());
            return planets.get(next);
        }
        return null;
    }

    public PlanetList shuffle() {
        List<Planet> listCopy = new ArrayList<>();
        Collections.copy(planets, listCopy);
        Collections.shuffle(listCopy);
        return new PlanetList(listCopy);

    }

    // Находит планету с наибольшим радиусом
    public double maxRadius() {
        if(planets.size() > 0) {
            double maxRadius = planets.get(0).radius;
            for (Planet item : planets) {
                if(item.radius > maxRadius)
                    maxRadius = item.radius;
            }
            return maxRadius;
        }
        else throw new IllegalArgumentException("list size must be not empty to find max!");
    }

    // Находит планету с наименьшим радиусом
    public double minRadius() {
        if(planets.size() > 0) {
            double minRadius = planets.get(0).radius;
            for (Planet item : planets) {
                if(item.radius < minRadius)
                    minRadius = item.radius;
            }
            return minRadius;
        }
        else throw new IllegalArgumentException("list size must be not empty to find min!");
    }

    public int find(Planet planet) {
        int count = 0;
        for(Planet item : planets) {
            if(item == planet)
                return count;
            count++;
        }
        return -1;
    }

    public boolean contains(Planet planet) {
        return planets.contains(planet);
    }
}
