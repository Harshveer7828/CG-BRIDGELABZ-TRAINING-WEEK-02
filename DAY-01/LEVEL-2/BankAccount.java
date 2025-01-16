class BankAccount {

    String accountHolder;
    int accountNumber;
    int balance;

    // Constructor to initialize the parameters
    BankAccount(String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Desposit money method
    void deposit(int amount) {
        balance += amount;
        System.out.println("Balance after deposit "+ amount + " is "+ balance);

    }

    // Withdrawing money (only if sufficient balance exists).
    void withdraw(int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Balance after withdraw "+ amount + " is "+ balance);
        }
    }

    // Displaying the current balance.
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount("Harsh veer singh" , 21,60000 );
        account.displayBalance();
        account.deposit(900);
        account.withdraw(900);
    }
}
