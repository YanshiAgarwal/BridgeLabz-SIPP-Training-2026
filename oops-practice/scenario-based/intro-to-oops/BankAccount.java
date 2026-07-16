//1. Design a BankAccount class with accountNumber, holder, balance. 
// Implement deposit(), withdraw() (with overdraft check), getStatement(). 
// Add a static field to track total accounts created. 
// Create 3 accounts and simulate 5 transactions each.

public class BankAccount{
    double accountNumber;
    String accountHolder;
    float accountBalance;
    static int totalAccounts = 0;

    BankAccount(double accountNumber, String accountHolder, float accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        totalAccounts++;
    }
    void deposit(float amount){
        accountBalance += amount;
        System.out.println("Deposited:" + amount + " New Balance: " + accountBalance);
    }
    void withdraw(float amount){
        if( amount <= accountBalance){
            accountBalance -= amount;
            System.out.println("Withdrawn:" + amount + "New Balance: " + accountBalance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public static void main(String[] args){
        BankAccount account = new BankAccount(1, "Anamika", 1000.0f);
        BankAccount account2 = new BankAccount(2, "Khushi", 500.0f);
        account.deposit(500.0f);    
        BankAccount account3 = new BankAccount(3, "Anamika Rai", 500.0f);       
        account3.withdraw(250.0f);
        System.out.println("Total accounts created: " + BankAccount.totalAccounts);
    }
}