public class BankAccount {
    
    private double balance = 0;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
 
    public static void main(String[] args) {
        
        BankAccount myBankAccount = new BankAccount(38.0);
        
        if (myBankAccount.getBalance() > 50) {
            myBankAccount.withdraw(50);
        } else if (myBankAccount.getBalance() > 30) {
            myBankAccount.withdraw(30);
        } else {
            myBankAccount.deposit(30);
        }
        
        double result = myBankAccount.getBalance();
        System.out.println(result);
    }
}
