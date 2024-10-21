package task_1;

public class Director implements Position {
    @Override
    public void printPositionName() {
        System.out.println("Director");
    }

    @Override
    public void printPositionInfo() {
        System.out.println("Salary: 4200 dollars");
        System.out.println("There is a separate parking space.");
        System.out.println("He has held the position since 2015.");
        System.out.println("Office number 402.");
    }
}