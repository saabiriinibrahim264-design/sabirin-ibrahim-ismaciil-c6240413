public class Bank {

    private String accountNumber;
    private String customerName;
    private double balance;

    public Bank(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance eber ka yar ma noqon karo. Defaulting to 0.0.");
            this.balance = 0.0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: $" + balance);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        Bank account1 = new Bank("ACC001", "Ahmed", 500.0);

        account1.displayAccount();

        account1.deposit(200.0);
        System.out.println("Current Balance: $" + account1.getBalance());

        account1.withdraw(100.0);
        System.out.println("Current Balance: $" + account1.getBalance());
    }
}