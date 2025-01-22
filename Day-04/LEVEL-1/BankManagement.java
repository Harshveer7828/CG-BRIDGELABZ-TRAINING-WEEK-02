import java.util.ArrayList;

public class BankManagement {
    public static void main(String[] args) {
        // Creating a bank and customers
        Bank bank = new Bank("Harsh Veer Bank");
        Customer customer1 = new Customer("Om");
        Customer customer2 = new Customer("John Doe");

        // Opening accounts
        bank.openAccount(customer1, 2000);
        bank.openAccount(customer2, 1000);

        // Displaying bank details for each customer
        customer1.displayBanks();
        customer2.displayBanks();

        // Viewing balances
        customer1.viewBalance();
        customer2.viewBalance();
    }
}

// Define a Bank class
class Bank {
    private String name;
    private ArrayList<Account> accounts; // List of accounts in the bank

    // Constructor
    Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>(); // Initialize the ArrayList
    }

    // Getter for bank name
    public String getName() {
        return name;
    }

    // Method to open a bank account
    void openAccount(Customer customer, int initialDeposit) {
        Account account = new Account(this, customer, initialDeposit);
        accounts.add(account);
        customer.addAccount(account); // Link the account to the customer
        System.out.println("Bank account opened successfully for " + customer.getName() + " with balance: " + initialDeposit);
    }
}

// Define a Customer class
class Customer {
    private String name;
    private ArrayList<Account> accounts; // List of accounts owned by the customer

    // Constructor
    Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>(); // Initialize the ArrayList
    }

    // Add an account to the customer's list
    void addAccount(Account account) {
        accounts.add(account);
    }

    // Getter for customer name
    public String getName() {
        return name;
    }

    // Display the banks the customer has accounts with
    void displayBanks() {
        System.out.println(name + " has accounts in the following banks:");
        for (Account account : accounts) {
            System.out.println(account.getBank().getName());
        }
    }

    // View the balances of all accounts
    void viewBalance() {
        System.out.println(name + " account balances:");
        for (Account account : accounts) {
            System.out.println(account.getBank().getName() + ", Balance: " + account.getBalance());
        }
    }
}

// Define an Account class
class Account {
    private Bank bank;
    private Customer customer;
    private int balance;

    // Constructor
    Account(Bank bank, Customer customer, int balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    // Getters for account details
    public Bank getBank() {
        return bank;
    }

    public int getBalance() {
        return balance;
    }
}
