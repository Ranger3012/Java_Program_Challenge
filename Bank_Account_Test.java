public class Bank_Account_Test {
    public static void main(String[] args) {

        // 5. Testing Scenario

        // Step 1: Open account with $1000.00
        Account account = new Account("ACC001", "Marie Tremblay", 1000.00);

        // Step 2: Deposit $500.00
        account.deposit(500.00);

        // Step 3: Withdraw $200.00 (successful)
        account.withdraw(200.00);

        // Step 4: Attempt to withdraw $2000.00 (should fail)
        account.withdraw(2000.00);

        // Step 5: Display final account information
        account.displayAccountInfo();
    }
}
