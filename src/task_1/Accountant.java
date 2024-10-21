package task_1;

public class Accountant implements Position {
    @Override
    public void printPositionName() {
        System.out.println("Accountant");
    }

    @Override
    public void printPositionInfo() {
        System.out.println("Salary: 2800 dollars");
        System.out.println("Parking space: available.");
        System.out.println("He has held the position since 2011.");
        System.out.println("Office number 104(b).");
    }
}