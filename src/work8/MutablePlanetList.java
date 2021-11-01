package work8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MutablePlanetList extends PlanetList {

    @Override
    public PlanetList add(Planet toAdd) {
        planets.add(toAdd);
        return this;
    }

    @Override
    public PlanetList remove(int index) {
        planets.remove(index);
        return this;
    }

    @Override
    public PlanetList shuffle() {
        Collections.shuffle(planets);
        return this;
    }
}
