package work1;

public class Ball {
    private int radius;
    private String type;

    public Ball(int radius, String type) {
        this.radius = radius;
        this.type = type;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "This is ball with radius " + this.radius + " and type " + this.type;
    }

    public void playWithBall(){
        System.out.println("Start play with ball for " + this.type + " sport");
    }
}
