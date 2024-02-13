import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Values.printValuesThatLengthLessOrMoreThanAverage(scan);
        DeveloperInfo.print("Иван", "Луковкин");

        Values.printValuesDividedByThree();
        DeveloperInfo.print("Иван", "Луковкин");
        Matrix.move(scan);
        DeveloperInfo.print("Владислав", "Бекренев");
        scan.close();
    }
}