public class Account {

    // Private attributes (encapsulation)
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor: all 3 values must be provided
    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters (to retrieve values safely)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // 2. Deposit Operation
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful: $" + String.format("%.2f", amount));
    }

    // 3. Withdrawal Operation
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return false;
        }

        if (amount > balance) {
            System.out.println("Error: Insufficient funds.");
            return false;
        }

        balance -= amount;
        System.out.println("Withdrawal successful: $" + String.format("%.2f", amount));
        return true;
    }

    // 4. Account Information Display
    public void displayAccountInfo() {
        System.out.println(
            "Account " + accountNumber + " - " + accountHolderName +
            " - Balance: $" + String.format("%.2f", balance)
        );
    }
}
