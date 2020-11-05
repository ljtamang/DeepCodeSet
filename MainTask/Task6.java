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
     * answer_2: balance is a double
     * question_3: What is the value of balance?
     * answer_3:  0
     * question_4: what is the access modifier for the variable balance?
     * answer_4: balance is a private variable of the class BankAccount

     */


    /**
     *  stm_comment: here, the variable balance is declared as private to restrict access of the variable within the class.
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
     * answer_2: initialBalance is a double with value 38.0
     * question_3: Can the variable balance be accessed directly outside the class BankAccount?
     * answer_3:  No, balance is a private variable of the class BankAccount and cannot be accessed directly without the class BankAccount
     * question_4: what is the operator used to access the variable balance
     * answer_4: 'this' operator is used to access the variable balance
     */


    /**
     *  stm_comment: the  constructor BankAccount initialises the value of bank balance by passing the parameter initialBalance
     *  in the constructor. As the balance variable is private and cannot be accessed directly outside the class, the value of
     *  balance is set by passing a parameter in the constructor specifying the balance. 'this' pointer is used to indicate
     *  that  variable balance is a variable of the class BankAccount.
     *  question_1:Please explain what the following constructor does?
     *  answer_1: the  constructor BankAccount initialises the value of bank balance by passing the parameter initialBalance
     *  in the constructor. As the balance variable is private and cannot be accessed directly outside the class, the value of
     *  balance is set by passing a parameter in the constructor specifying the balance. 'this' operator is used to indicate
     *  that the variable balance is a variable of the class BankAccount.
     * */
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * logical_step_3: Defines methods for financial transaction in the Bank account:
     * The deposit method helps deposit the specified amount to the current bank account balance of the user
     * The withdraw method deducts the specified amount from the current bank account balance of the user.
     * and getBalance specifies the current value of balance in the given bank account
     * logical_step_details: Define public methods deposit, withdraw and getBalance.Public method deposit will add the
     * specified amount to the bank balance. Public method withdraw will subtract the specified amount from the bank balance.
     * the public method getBalance will return the value of the current bank balance.
     *  question_1: What does the following block of code do?
     * answer_1: Defines methods for financial transaction in the Bank account:
     * The deposit method helps deposit the specified amount to the current bank account balance of the user
     * The withdraw method deducts the specified amount from the current bank account balance of the user.
     * and getBalance displays the current balance in the given bank account
     * question_2: What does the deposit method do?
     * answer_3: The deposit method adds the given amount to the current bank account balance of the user.
     * question_4: What does the withdraw method execute?
     * answer_4: The withdraw method deducts the amount from the current bank account balance of the user.
     * question_5: What is the return type of the method deposit?
     * answer_5: the method deposit returns void
     * question_6: What is the return type of the function getBalance?
     * answer_6: The method returns a double value.
     * question_7: What is the datatype parameter passed for the function withdraw?
     * answer_7: double
     * question_7: What is the  access modifier of the method deposit?
     * answer_7: public
     */

    /**
     *  stm_comment:  public methods of a class can be directly access outside the class as well. A class method can be made public if we prepend the
     *  keyword public in front of the return type of the function name. In the method deposit,  adding the keyword public,
     *  in front of 'void deposit' , makes it accessible to other method outside the class.
     *  question_1:Please explain what the following the keyword public does in the context of the method deposit.
     *  answer_1: public methods of a class can be directly access outside the class as well. A class method can be made public if we prepend the
     *  keyword public in front of the return type of the function name. In the method deposit,  adding the keyword public,
     *  in front of 'void deposit' , makes it accessible to other method outside the class.
     * */

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
         * logical_step_details: The instance/ object of class BankAccount myBankAccount helps to access the public methods of the class BankAccount and
         * also to call the constructor of BankAccount. .
         * question_1: What is the purpose of myBankAccount?
         * answer_1: The purpose of the myBankAccount is it helps to call the public methods of the class BankAccount and also calls the constructor of BankAccount.
         * question_2: Why is there a parameter passed when creating an object of the class BankAccount?
         * answer_2: The parameter is passed when creating an object of the class BankAccount because this  calls the constructor and this parameter is sent to the constructor.
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
         * logical_step_5: Check if the balance is greather than 50, if true else deposits 50 to the bank account. Also,
         * check if the bank balance is greater then 30. If true, deposit 30 to the bank balance.If flase, deposit 30 to the bank balance
         * logical_step_details: Bank balance of the user is checked under the if-else-if conditions .
         * According to the condition satisfied a transaction is made by either deposit or withdraw method of the class BankAccount.
         * question_1: What does the following block of code do?
         * answer_1: check if the balance is greather than 50, if true else deposits 50 to the bank account. Also,
         * check if the bank balance is greater then 30. If true, deposit 30 to the bank balance.If flase, deposit 30 to the bank balance
         * question_2: Which condition if, else if or else condition is satisfied in the code below
         * answer_2: The else-if condition or statement is satisfied because myBankAccount's value is 38.0 which is greater than 30.
         * question_3: When is the method deposit is called?
         * answer_3: The method deposit is called if the bank balance is less than or equal to 30.
         */
        if (myBankAccount.getBalance() > 50) {
            myBankAccount.withdraw(50);
        } else if (myBankAccount.getBalance() > 30) {
            myBankAccount.withdraw(30);
        } else {
            myBankAccount.deposit(30);
        }

        /**
         * logical_step_6: Display the final balance after the transaction
         * logical_step_details: Declares a double variable result that calls the public method "getBalance" with the help of the class object "myBankAccount".
         * The method getBalance returns the final balance of the user's bank account.
         * question_1: What does the following block of code do?
         * answer_1: Declares a double variable result that calls the public method "getBalance" with the help of the class object "myBankAccount".
         * question_2: What is the output of the following block of code
         *  answer_2: 8.0
         *  question_3: what does the function getBalance return?
         *  answer_3: getBalance returns the value of the current bank balance
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
