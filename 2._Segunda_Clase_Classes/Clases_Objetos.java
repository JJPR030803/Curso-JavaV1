public class Clases_Objetos {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", 25);
        person1.sayHello();
    }
}

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
