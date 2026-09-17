interface PaymentService {
    void pay(String upiId, double amount)
        throws InvalidUPIException,InvalidAmountException,InsufficientBalanceException;

    void checkBalance();
}

// Custom Exception 1
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// Custom Exception 2
class InvalidUPIException extends Exception {
    InvalidUPIException(String message) {
        super(message);
    }
}

// Custom Exception 3
class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

// Wallet Class
class Wallet {

    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    // Constructor
    Wallet(String userName, String mobileNumber,String upiId, double balance) {

        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = balance;
    }

    // Add Money
    void addMoney(double amount)
        throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount! Enter a positive amount.");
        }

        balance += amount;

        System.out.println("Money added successfully: Rs." + amount);
    }

    // Get Balance
    double getBalance() {
        return balance;
    }

    void deductMoney(double amount) {
    balance -= amount;
}

    // Display Wallet Details
    void displayWalletDetails() {

        System.out.println("\n--- Wallet Details ---");
        System.out.println("User Name: " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Balance: Rs." + balance);
    }
}

// UPI Payment Class
class UPIPayment implements PaymentService {

    private Wallet wallet;

    // Constructor
    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    // Pay Method
    public void pay(String upiId, double amount)
        throws InvalidUPIException,InvalidAmountException,InsufficientBalanceException {

        // Validate UPI ID
        if (upiId == null ||
            !upiId.contains("@") ||
            upiId.startsWith("@") ||
            upiId.endsWith("@")) {

            throw new InvalidUPIException("Invalid UPI ID!");
        }

        // Validate Amount
        if (amount <= 0) {

            throw new InvalidAmountException("Invalid amount! Amount must be positive.");
        }

        // Check Balance
        if (amount > wallet.getBalance()) {

            throw new InsufficientBalanceException("Insufficient balance! Payment failed.");
        }

        // Deduct Amount
       
        wallet.deductMoney(amount);

        System.out.println("Payment successful!");

        System.out.println("Paid Rs." + amount + " to " + upiId);
    }

    // Check Balance
    public void checkBalance() {

        System.out.println("Available Balance: Rs." + wallet.getBalance());
    }
}

// Main Class
public class Task_2 {

    public static void main(String[] args) {

        Wallet wallet = new Wallet("Harsha","9876543210","harsha@upi",1000);

        UPIPayment payment = new UPIPayment(wallet);

        try {

            wallet.addMoney(500);

            payment.checkBalance();

            payment.pay("friend@upi", 300);

        } catch (InvalidUPIException |InvalidAmountException |  InsufficientBalanceException e) {

            System.out.println("Transaction Failed: " + e.getMessage());

        } finally {

            System.out.println("\nTransaction process completed.");

            wallet.displayWalletDetails();

            payment.checkBalance();
        }
    }
}
