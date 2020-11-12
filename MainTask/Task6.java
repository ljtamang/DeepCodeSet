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
     * logical_step_1: Specify the initial value bank balance
     * logical_step_details: Declare a private double variable balance and assign it's value to 0..
     * question_1: What does the following block of code do?
     * answer_1: Specify the initial value bank balance
     * question_2: What is the datatype of the variable balance?
     * answer_2: the data type of the variable balance is double
     * question_3: What is the value of balance?
     * answer_3:  0
     */

    /**
     *  stm_comment: The variable balance is declared as private to restrict access of the variable within the class.
     *  question_1:Please explain what the variable balance is declared as a private variable
     *  answer_1: the variable balance is declared as private to restric the access of the variable within the class.
     * */

    private double balance = 0;

    /**
     * logical_step_2: Define a constructor for public class BankAccount to initialise the balance of the bank account
     * logical_step_details: Using a default constructor set the initial bank balance in the variable initialBalance. initialBalance is
     * set to the value that is passed during the constructor call
     * question_1: What does the following block of code do?
     * answer_1: Define a constructor for public class BankbAccount to initialise the  balance of the bank account
     * question_2: What is the datatype and value of the variable initialBalance?
     */
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * logical_step_3: Defines methods to peform deposit, withdwarl and access balance in the bank account.
     * logical_step_details: Define public methods deposit, withdraw and getBalance.Public method deposit will add the
     * specified amount to the bank balance. Public method withdraw will subtract the specified amount from the bank balance.
     * the public method getBalance will return the value of the current bank balance.
     * question_1: What does the following block of code do?
     * answer_1:  Defines methods to peform deposit, withdwarl and access balance in the bank account.
     * question_2: What does the deposit method do?
     * answer_3: The deposit method adds the given amount to the current bank account balance of the user.
     * question_4: What does the withdraw method do?
     * answer_4: The withdraw method deducts the amount from the current bank account balance of the user.
     * question_5: What does the getBalance method do?
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
         * logical_step_4: Create an instance "myBankAccount" of the class BankAccount.
         * logical_step_details: Create an instance "myBankAccount" of the class BankAccount. The construcotr is invoked by passing value 38.
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
