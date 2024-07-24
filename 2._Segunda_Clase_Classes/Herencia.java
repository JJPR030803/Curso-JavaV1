public class Herencia {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Outputs "Woof!"
    }
}


class Animal {
    void makeSound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

