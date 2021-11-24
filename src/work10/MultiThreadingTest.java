package work10;

import java.util.Scanner;

public class MultiThreadingTest {

    volatile boolean stopFlag = false;

    public void pingPongUntilInteruption() {
        new Thread(() -> {
            while (!stopFlag) {
                System.out.println("ping");
                System.out.println("pong");
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    System.out.println("prosnulsya (");
                }
            }
        }
        ).start();
    }

    public static void main(String[] args) {
        MultiThreadingTest test = new MultiThreadingTest();
        test.pingPongUntilInteruption();
        Scanner in = new Scanner(System.in);
        // Чтобы сделать прерывание, надо ввести текст
        in.next();
        test.stopFlag = true;
    }
}


