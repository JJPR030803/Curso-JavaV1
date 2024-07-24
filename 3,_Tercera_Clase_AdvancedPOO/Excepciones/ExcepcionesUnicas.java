

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExcepcionesUnicas{
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age is less than 18");
        } else {
            System.out.println("Age is 18 or more");
        }
    }
}
