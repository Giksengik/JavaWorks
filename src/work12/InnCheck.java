package work12;

import java.util.Scanner;

public class InnCheck {

    static class InnException extends Exception {
    }

    static void checkInn(String inn) throws InnException {
        ValidInnFactory factory = new ValidInnFactoryImpl();
        if (factory
                .getValidInn()
                .stream()
                .noneMatch(inn::equals)
        ) throw new InnException();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите inn");
        String inn = in.next();
        try {
            checkInn(inn);
        } catch (InnException e) {
            System.out.println("Inn isn't valid");
        }
    }


}
