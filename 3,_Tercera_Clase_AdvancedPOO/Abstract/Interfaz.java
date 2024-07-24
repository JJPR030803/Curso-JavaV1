
public class Interfaz {
    public static void main(String[] args) {
        Movable movable = new Car();
        movable.move(); // Outputs "Car is moving"
    }
}
interface Movable {
    void move();
}

class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
