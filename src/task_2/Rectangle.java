package task_2;

class Rectangle extends Figure {
    public double width;
    public double height;

    public Rectangle(double withs, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean isValid() {
        return width > 0 && height > 0; // Проверка валидности
    }
}