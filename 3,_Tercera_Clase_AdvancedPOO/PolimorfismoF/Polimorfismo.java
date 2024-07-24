//**Method Overloading

//*Definition: Multiple methods in the same class with the same name but different parameters (different type, number, or both).




class MathOperations {
    // Overloaded add method
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polimorfismo{
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(5, 10)); // Outputs 15
        System.out.println(math.add(5, 10, 15)); // Outputs 30
    }
}
