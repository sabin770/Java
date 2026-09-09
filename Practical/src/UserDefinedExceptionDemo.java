class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo {
    void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        UserDefinedExceptionDemo obj = new UserDefinedExceptionDemo();

        try {
            obj.validate(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}