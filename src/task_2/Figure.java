package task_2;

abstract class Figure {
    protected String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();
    public abstract boolean isValid();

    public void printInfo() {
        System.out.printf("%s: Area = %.2f, Perimeter = %.2f%n", name, area(), perimeter());
    }
}