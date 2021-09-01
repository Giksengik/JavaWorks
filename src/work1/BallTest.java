package work1;

public class BallTest {
    public static void main(String[] args) {
        Ball coolBall = new Ball(55, "Voleyball");
        System.out.println(coolBall);
        coolBall.playWithBall();
        coolBall.setRadius(5);
        coolBall.setType("Ping pong");
        System.out.println(coolBall);
        coolBall.playWithBall();
    }
}
