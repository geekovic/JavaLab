import java.util.Scanner;

// Custom exception class
class InsufficientAmountException extends Exception {
    public InsufficientAmountException(String message) {
        super(message);
    }
}

public class AmountCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int requiredAmount = 500;

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        try {
            if (amount < requiredAmount) {
                throw new InsufficientAmountException("Amount is insufficient. Minimum ₹500 required.");
            } else {
                System.out.println("Amount is sufficient. Proceeding with the operation.");
            }
        } catch (InsufficientAmountException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}
