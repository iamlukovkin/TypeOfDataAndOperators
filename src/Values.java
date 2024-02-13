import java.util.Scanner;

public class Values {
    /**
     * Выводит значения, длина которых меньше или больше средней длины всех введенных значений.
     *
     * @param  scan  объект Scanner для считывания ввода
    */
    public static void printValuesThatLengthLessOrMoreThanAverage(Scanner scan) {
        int count = Scan.getIntPositiveValue("Введите количество чисел", scan);
        String[] values = Scan.inputValues(count, scan);
        int average = getAverageLengthOfValues(values);
        String[] valuesLessAndMoreThanAverage = getValuesMoreAndLessThenAverage(values, average);
        System.out.println(valuesLessAndMoreThanAverage[0]);
        System.out.println(valuesLessAndMoreThanAverage[1]);
    }

    public static int getAverageLengthOfValues(String[] values) {
        int sum = 0;
        for (String value : values) {
            sum += value.length();
        }
        return sum / values.length;
    }

    public static String[] getValuesMoreAndLessThenAverage(String[] values, int average) {
        System.out.println("Средняя длина: " + average);
        String lessThanAverage = "Числа, длина которых меньше средней:\n";
        String moreThanAverage = "Числа, длина которых больше средней\n";
        for (String value : values) {
            String valueInfo = value + " его длина: " + value.length() + "\n";
            if (value.length() < average) {
                lessThanAverage += valueInfo;
            } else if (value.length() > average) {
                moreThanAverage += valueInfo;
            }
        }
        return new String[] {lessThanAverage, moreThanAverage};
    }

    /**
     * Выводит числа, длина которых делится на 3 без остатка.
     */
    public static void printValuesDividedByThree() {
        String message = "Числа, длина которых делится на 3 без остатка:\n";
        int[] values = getValuesDividedByThree();
        for (int i : values) {
            System.out.print(i + " ");
        }
    }

    public static int[] getValuesDividedByThree() {
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                counter++;
            }
        }
        int[] valuesArray = new int[counter];
        for (int i = 0; i <= 99; i++) {
            if ((i + 1) % 3 == 0) {
                valuesArray[i] = i + 1;
            }
        }
        return valuesArray;
    }
}
