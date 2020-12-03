/**
 * author: Suraj Maharjan
 * topics: Classes and objects
 * subtopics: Create class,class attributes,class Methods, constructors, Create object
 * goalDescription: This program checks a user's bank account balance and allows a user to withdraw or deposit money according to some predefined criteria.
 * source: N/A
 * input: NA
 * output: 8.0
 */

public class BankAccount {

    /**
     * logical_step_1: Declare a variable called balance that stores the balance amount in the bank account. 
     * logical_step_details: Declare a variable called balance that stores the balance amount in the bank account. 
     * The balance amount is initialized to 0.
     * question_1: What does the following block of code do?
     * answer_1: Declare a variable called balance that stores the balance amount in the bank account. 
     * question_2:To what value is the balance amount initalized?
     * answer_2:  The balance amount is intialized to 0
     */

    private double balance = 0;

    /**
     * logical_step_2:  Defines a constructor  method which is used to initialize objects.
     * logical_step_details: Defines a constructor  method which is used to initialize objects.
     * The constructor’s input parameter initialBalance  is used to initialize the value of balance attribute.
     * question_1: What does the following block of code do?
     * answer_1: Defines a constructor  method which is used to initialize objects.
     * question_2: What is constructor’s input parameter initialBalance used for?
     * answer_2: The constructor’s input parameter initialBalance  is used to initialize the value of balance attribute.
     */
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * logical_step_3: Create method deposit, withdraw and getBalance. 
     * logical_step_details: Create method deposit, withdraw and getBalance. 
     * method deposit takes amount and increase the value of balance by the value of the amount.
     * method withdraw takes amount as input and decreases the value of balance by the value of the amount.
     * method getBalance returns the balance amount in the bank account. 
     * question_1: What does the following block of code do?
     * answer_1:  Create method deposit, withdraw and getBalance. 
     * question_2: What does the deposit method do?
     * answer_2: method deposit takes amount and increase the value of balance by the value of the amount.
     * question_3: What does the withdraw method do?
     * answer_3:  method withdraw takes amount as input and decreases the value of balance by the value of the amount.
     * question_4: What does the getBalance method do?
     * answer_4:  method getBalance returns the balance amount in the bank account. 
     */

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

        /**
         * logical_step_4: Create an object called "myBankAccount".
         * logical_step_details: Create an object called "myBankAccount".
         Create an instance "myBankAccount" of the class BankAccount. The construcotr is invoked by passing value 38.
         * question_1:  What does the following block of code do??
         * answer_1:  Create an instance "myBankAccount" of the class BankAccount.
         * question_2: What value is pass to to invoke constructor?
         * answer_2: The construcotr is invoked by passing value 38.
         */

        /**
         *  stm_comment: The parameter initialBalance, is passed when instantiating the class object, myBankAccount of the class BankAccount
         *  During the instantiation the constructor of the class is also called and through parameter within the parenthesis of
         *  the constructor the initial balance is set.
         *  question_1:Please explain what the following class instantiation does
         *  answer_1: The parameter initialBalance, is passed when instantiating the class object, myBankAccount of the class BankAccount
         *  During the instantiation the constructor of the class is also called and through parameter within the paranthesis of
         *  the constructor the initial balance is set.
         * */
        BankAccount myBankAccount = new BankAccount(38.0);

        /**
         * logical_step_5: Check if balance and decide withdrawal amount or deposit based on the value of balance.
         * logical_step_details:  Check if balance and decide withdrawal amount or deposit based on the value of balance.
         * The value of myBankAccount.getBalance() is 38. Therefore, else if condition is satisfied. The statement insdie else if withrdawas amount 30.
         * question_1: What does the following block of code do?
         * answer_1: Check if balance and decide withdrawal amount or deposit based on the value of balance.
         * question_2: What is the value of myBankAccount.getBalance()?
         * answer_1: 38
         * question_2: Which condition if, else if or else condition is satisfied in the code below
         * answer_2: The else-if condition or statement is satisfied.
         * question_3: What does statemen inside else if do?
         * answer_3: withdraws 30
         */
        if (myBankAccount.getBalance() > 50) {
            myBankAccount.withdraw(50);
        } else if (myBankAccount.getBalance() > 30) {
            myBankAccount.withdraw(30);
        } else {
            myBankAccount.deposit(30);
        }

        /**
         * logical_step_6: Acess the value of balance and display the value of balance.
         * logical_step_details: Acess the value of variable balance and display the value of balance.
         * The method getBalance returns the final balance of the user's bank account. The printed value is 8.
         * question_1: What does the following block of code do?
         * answer_1: Acess the value of variable balance and display the value of balance.
         * question_2: What is the value returened by myBankAccount.getBalance()?
         *  answer_2: 8.0
         *  question_3: What value is printed?
         *  answer_3: the printed value is 8.
         */
        /**
         * stm_comment:  myBankAccount.getBalance() is used to access the value of property balance.
         * question_1: What is myBankAccount.getBalance() used for?
         * answer_1: myBankAccount.getBalance() is used to access the value of property balance.
         */
        double result = myBankAccount.getBalance();
        System.out.println(result);
    }
}
