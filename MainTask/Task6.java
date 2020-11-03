/**
 * author: Suraj Maharjan
 * topics: Classes and objects
 * subtopics: Initializing an object of the Class to call the instance methods
 * goalDescription: This program checks a user's bank account balance under if else statements and based on the conditions defined in the if else statements it calls the instance method of the class and executes the operation as defined in the instance methods. 
 * source: N/A
 * input: NA
 * output: 8.0
 */

public class BankAccount {

    /**
    * logical_step_1: Declaring a private double/float variable and assign value.
    * logical_step_details: Declaring a variable as private so as to access only within its own class. double, 0
    * question_1: Why is the variable declared as private?
    * answer_1: Declaring a variable as private so as to access only within its own class.
    * question_2: What type of variable is balance and what is its value? 
    * answer_2: double, 0
    */
    
    private double balance = 0;
    
    /**
    * logical_step_2: Declaring a constructor for the class BankAccount.
    * logical_step_details: The use of a class constructor is to initialize objects. The constructor is called when an object of a class is created.
    * question_1: What is the use of a class contructor?
    * answer_1: The use of a class constructor is to initialize objects. 
    * question_2: When is the constructor called?
    * answer_2: The constructor is called when an object of a class is created.
    */
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
    * logical_step_3: Create public method deposit
    * logical_step_details: public method is defined by adding public in front of the method.public method can only be accessed with the help of objects of the class. double. The method adds the amount to the current bank account balance of the user.
    * question_1: What is public method?
    * answer_1: public method is defined by adding public in front of the method.
    * question_2: How can public method be accessed?
    * answer_2: public method can only be accessed with the help of objects of the class.
    * question_3: What type of variable is amount?
    * answer_3: double
    * question_4: What does the method execute?
    * answer_4: The method adds the amount to the current bank account balance of the user.
    */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
    * logical_step_4: Create public method withdraw
    * logical_step_details: The method deducts the amount from the current bank account balance of the user.
    * question_1: What does the method execute?
    * answer_1: The method deducts the amount from the current bank account balance of the user.
    */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
    * logical_step_5: Create public method getBalance
    * logical_step_details: The method getBalance is defines as double instead of void because this means that the return value from this method is a double.
    * question_1: Why is the method getBalance defined as double instead of void?
    * answer_1: The method getBalance is defines as double instead of void because this means that the return value from this method is a double.
    * question_2: What does the method return?
    * answer_2: The method getBalance returns the current balance of the user.
    */
    public double getBalance() {
        return balance;
    }
 
    public static void main(String[] args) {
        
        /**
        * logical_step_6: Create an object "myBankAccount" of the class BankAccount.
        * logical_step_details: The purpose of the myBankAccount is it helps to call the public methods of the class BankAccount and also calls the constructor of BankAccount. The parameter is passed when creating an object of the class BankAccount because this also calls the constructor and this parameter is sent to the constructor.
        * question_1: What is the purpose of myBankAccount?
        * answer_1: The purpose of the myBankAccount is it helps to call the public methods of the class BankAccount and also calls the constructor of BankAccount.
        * question_2: Why is there a parameter passed when creating an object of the class BankAccount?
        * answer_2: The parameter is passed when creating an object of the class BankAccount because this also calls the constructor and this parameter is sent to the constructor.
        */
        BankAccount myBankAccount = new BankAccount(38.0);
        
        /**
        * logical_step_7: Checks and withdraws if the balance is greater or else deposits the amount to the bank account. 
        * logical_step_details: if else-if statement checks the balance of the user and executes the required operations when a condition is satisfied.
        * question_1: What does the if else-if statement do?
        * answer_1: if else-if statement checks the balance of the user and executes the required operations when a condition is satisfied.
        * question_2: Which condition or statement is satisfied here?
        * answer_2: The else-if condition or statement is satisfied because myBankAccount value is 38.0 which is greater than 30 which satisfies the condition.
        * question_3: When does the methods withdraw and deposit is called?
        * answer_3: The method withdraw is called when the if and else-if conditions are satisfied and when both of them are not satisfied then else works which executes and calls the deposit method.
        */
        if (myBankAccount.getBalance() > 50) {
            myBankAccount.withdraw(50);
        } else if (myBankAccount.getBalance() > 30) {
            myBankAccount.withdraw(30);
        } else {
            myBankAccount.deposit(30);
        }
        
        /**
        * logical_step_8:  Declaring a double variable that is assigned the balance of the bank account.
        * logical_step_details: The method getBalance returns the final balance of the user's bank account.
        * question_1: What is returned from the method getBalance?
        * answer_1: The method getBalance returns the final balance of the user's bank account.
        */
        double result = myBankAccount.getBalance();

        /**
        * stm_comment: Prints the value of the result.
        * question_1: What value does the result contain?
        * answer_1: The result contains the final balance which is 8.0.
        */
        System.out.println(result);
    }
}
