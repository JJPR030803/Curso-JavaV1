public class SintaxisBasica {
    public static void main(String[] args) {
        int number = 10;
        String message = "El numero es: ";
        System.out.println(message + number);

        // Control structures
        if (number > 5) {
            System.out.println("Numero es mayor que 5");
        } else {
            System.out.println("Numero es menor que 5");
        }

        // Loops
        for (int i = 0; i < 5; i++) {
            System.out.println("i es igual a: " + i);
        }
    }
}
