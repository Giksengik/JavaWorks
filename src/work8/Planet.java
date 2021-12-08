package work8;

public class Planet implements Comparable<Planet> {
    String name;
    double radius;

    public Planet(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }

    @Override
    public int compareTo(Planet o) {
        if(this.radius > o.radius)
            return 1;
        else if(this.radius < o.radius)
            return -1;
        return 0;
    }
}
