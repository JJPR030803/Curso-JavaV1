

public class Method_overriding {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal perro = new Dog();
        perro.makeSound();
        animal.makeSound(); // Outputs "Meow!"
    }
}
class Animal {
    void makeSound() {
        System.out.println("Some sound...");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}


class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Woof");
    }
}