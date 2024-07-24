public class Encapsulacion {
    public static void main(String[] args) {
        Person person = new Person("Carol", 28);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años de edad.");
        person.setAge(29);
        System.out.println(person.getName() + " ahora tiene " + person.getAge() + " años de edad.");
    }
}
class Person {
    private String name;
    private int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
