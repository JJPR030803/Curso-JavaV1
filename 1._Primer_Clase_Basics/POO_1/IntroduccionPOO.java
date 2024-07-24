public class IntroduccionPOO {
    
        public static void main(String[] args) {
            // Creating objects
            Person person1 = new Person();
            person1.name = "Alice";
            person1.age = 30;
    
            // Calling methods
            person1.sayHello();
        }
    
}

class Person {
    // Attributes
    String name;
    int age;

    // Methods
    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}