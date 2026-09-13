class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class Bank {
    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Available: $" + balance);
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        }
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Bank b = new Bank();

        try {
            b.withdraw(3000);
            b.withdraw(3000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}