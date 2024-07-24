

public class Abstracto {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw(); // Outputs "Drawing a circle"
    }
}
abstract class Shape {
    abstract void draw(); // Abstract method
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

