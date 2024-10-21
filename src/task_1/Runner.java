package task_1;
import java.util.Scanner;

/** Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который задает поведения для вывода на экран название должности.
 * Имплементировать этот метод в созданные классы.
 * Создать класс-раннер с методом мейн для запуска программы.
 * Запросить с консоли код должности и вывести название должности на экран.
 */

public class Runner {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       Position[] positions = {new Director(), new Accountant(), new Worker()};
       for (int i = 0; i < positions.length; i++) {
           System.out.print("Enter the position code: " + (i + 1) +
                   " (1 - Director; 2 - Accountant; 3 - Worker):");
           int code = scanner.nextInt();

           if (code >= 1 && code <= positions.length) {
               positions[code - 1].printPositionName();
               positions[code - 1].printPositionInfo();
           } else {
               System.out.println("Error, incorrect position code!");
           }
       } scanner.close();
    }
}