package task_1;

public class Worker implements Position {
    @Override
    public void printPositionName() {
        System.out.println("Worker");
    }

    @Override
    public void printPositionInfo() {
        System.out.println("Salary: 1850 dollars");
        System.out.println("Parking space: not available.");
        System.out.println("He has held the position since 2020.");
        System.out.println("Location: in the basement school buildings");
    }
}