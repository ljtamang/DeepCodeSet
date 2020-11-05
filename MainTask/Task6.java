/**
 * author: Suraj Maharjan
 * topics: Classes and objects
 * subtopics: Create class, Class attributes, Class Methods, Class Constructors, Create object
 * goalDescription: This program checks a user's bank account balance under if else statements and based on the conditions defined in the if else statements it calls the instance method of the class and executes the operation as defined in the instance methods. 
 * source: N/A
 * input: NA
 * output: 8.0
 */

public class BankAccount {

    /**
    * logical_step_1: Declares a private variable balance of double type and assign value along with declaring a constructor for the class BankAccount.
    * logical_step_details: Declares a double variable assigning 0 to it and then create a constructor for the class BankAccount.
    * Declaring a variable as private so as to access only within its own class. double, 0. The use of a class constructor is to initialize objects.
    * The constructor is called when an object of a class is created.
    * question_1: What does the following block of code do?
    * answer_1: Declares a double variable assigning 0 to it and then create a constructor for the class BankAccount.
    * question_2: Why is the variable declared as private?
    * answer_2: Declaring a variable as private so as to access only within its own class.
    * question_3: What type of variable is balance and what is its value? 
    * answer_3: double, 0
    * question_4: What is the use of a class contructor?
    * answer_4: The use of a class constructor is to initialize objects. 
    * question_5: When is the constructor called?
    * answer_5: The constructor is called when an object of a class is created.
    */
    
    private double balance = 0;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
    * logical_step_2: Defines public methods deposit, withdraw and getBalance.
    * logical_step_details: Definines public methods deposit, withdraw and getBalance and all of them have their method declaration and the method body. public method is defined by adding public in front of the method. public method can only be accessed with the help of objects of the class. double. The deposit method adds the amount to the current bank account balance of the user. The withdraw method deducts the amount from the current bank account balance of the user. The method getBalance is defines as double instead of void because this means that the return value from this method is a double. The method getBalance returns the current balance of the user.
    * question_1: What does the following block of code do?
    * answer_1: Definines public methods deposit, withdraw and getBalance and all of them have their method declaration and the method body.
    * question_2: What is public method?
    * answer_2: public method is defined by adding public in front of the method.
    * question_3: How can public method be accessed?
    * answer_3: public method can only be accessed with the help of objects of the class.
    * question_4: What type of variable is amount?
    * answer_4: double
    * question_5: What does the deposit method execute?
    * answer_5: The deposit method adds the amount to the current bank account balance of the user.
    * question_6: What does the withdraw method execute?
    * answer_6: The withdraw method deducts the amount from the current bank account balance of the user.
    * question_7: Why is the method getBalance defined as double instead of void?
    * answer_7: The method getBalance is defines as double instead of void because this means that the return value from this method is a double.
    * question_8: What does the getBalance method return?
    * answer_8: The method getBalance returns the current balance of the user.
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
        * logical_step_3: Create an object "myBankAccount" of the class BankAccount.
        * logical_step_details: The purpose of the myBankAccount is it helps to call the public methods of the class BankAccount and also calls the constructor of BankAccount. The parameter is passed when creating an object of the class BankAccount because this also calls the constructor and this parameter is sent to the constructor.
        * question_1: What is the purpose of myBankAccount?
        * answer_1: The purpose of the myBankAccount is it helps to call the public methods of the class BankAccount and also calls the constructor of BankAccount.
        * question_2: Why is there a parameter passed when creating an object of the class BankAccount?
        * answer_2: The parameter is passed when creating an object of the class BankAccount because this also calls the constructor and this parameter is sent to the constructor.
        */
        BankAccount myBankAccount = new BankAccount(38.0);
        
        /**
        * logical_step_4: Checks and withdraws if the balance is greater or else deposits the amount to the bank account. 
        * logical_step_details: Bank balance of the user is checked under the if-else-if conditions and executes the required operations when a condition is satisfied. The else-if condition or statement is satisfied because myBankAccount value is 38.0 which is greater than 30 which satisfies the condition. The method withdraw is called when either if or else-if condition is satisfied and when both of them are not satisfied then else works which executes and calls the deposit method.
        * question_1: What does the following block of code do?
        * answer_1: Bank balance of the user is checked under the if-else-if conditions and executes the required operations when a condition is satisfied.
        * question_2: Which condition or statement is satisfied here?
        * answer_2: The else-if condition or statement is satisfied because myBankAccount value is 38.0 which is greater than 30 which satisfies the condition.
        * question_3: When does the methods withdraw and deposit is called?
        * answer_3: The method withdraw is called when either if or else-if condition is satisfied and when both of them are not satisfied then else works which executes and calls the deposit method.
        */
        if (myBankAccount.getBalance() > 50) {
            myBankAccount.withdraw(50);
        } else if (myBankAccount.getBalance() > 30) {
            myBankAccount.withdraw(30);
        } else {
            myBankAccount.deposit(30);
        }
        
        /**
        * logical_step_5: Declaring a double variable that is assigned the balance of the bank account.
        * logical_step_details: Declares a double variable result that calls the public method "getBalance" with the help of the class object "myBankAccount". The method getBalance returns the final balance of the user's bank account.
        * question_1: What does the following line of code do?
        * answer_1: Declares a double variable result that calls the public method "getBalance" with the help of the class object "myBankAccount".
        * question_2: What is returned from the method getBalance?
        * answer_2: The method getBalance returns the final balance of the user's bank account.
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
