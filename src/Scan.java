import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan {
    public static int getIntValue(String message, Scanner scan) {
        while (true) {
            System.out.println(message);
            try { return scan.nextInt(); }
            catch (InputMismatchException e) {
                System.out.println("Неверный ввод!");
                scan.nextLine();
            }
        }
    }

    public static MoveDestination getMatrixDestination(String message, Scanner scan) {
        MoveDestination destination;
        do {
            System.out.println(message);
            String userAnswer = scan.nextLine();
            destination = MoveDestination.getDestination(userAnswer);
        } while (destination == null);
        return destination;
    }

    public static int getIntPositiveValue(String message, Scanner scan) {
        int value = getIntValue(message, scan);
        while (value <= 0) {
            System.out.println("Неверный ввод!");
            value = getIntValue(message, scan);
        }
        return value;
    }

    public static String[] inputValues(int count, Scanner scan) {
        String[] values = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Введите " + (i + 1) + " число: ");
            values[i] = scan.next();
        }
        return values;
    }
}
