package task_2;

/** Написать иерархию классов Фигура: Треугольник, Прямоугольник, Круг.
 * Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя абстрактный класс/методы).
 * Создать массив из 5 разных фигур.
 * Пройтись циклом по массиву и вывести информацию о каждой фигуре.
 * Вывести на экран сумму периметров всех фигур в массиве.
 */

public class Main {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(5, 6, 8),
                new Rectangle(7, 7),
                new Circle(5),
                new Triangle(11, 12, 13),
                new Rectangle(6, 9),
                new Circle(-100)
        };

        double totalPerimeter = 0;

        for (Figure figure : figures) {
            if (figure.isValid()) {
                figure.printInfo();
                totalPerimeter += figure.perimeter();
            } else {
                System.out.println("Error: a shape with incorrect dimensions will not be processed");
            }
        }

        System.out.printf("The sum of the perimeters of all shapes: %.2f%n ", totalPerimeter);
    }
}
