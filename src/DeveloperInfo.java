import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DeveloperInfo {
    public static void print(String name, String surname) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println(
                "\n____________________________________________________________\n" +
                        "Данное задание выполнил: " + surname + " " + name + "\n" +
                        "Дата и время получения задания: " + "05.02.2024 13:35" + "\n" +
                        "Дата и время выполнения задания: " + formattedDateTime
                + "\n____________________________________________________________\n"

        );
    }
}
