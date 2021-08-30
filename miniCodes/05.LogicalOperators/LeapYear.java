/**
 * author: Priti Oli, refined by Lasang Tamang 
 * topics: Logical Operator 
 * subtopics: Logical AND, Logical OR, ternary operator 
 * goalDescription: Checks whether a year is a leap year or not 
 * source: N/A
 * input: N/A
 * output: Leap Year
 */
public class LeapYear {
    public static void main(String[] args) {

        /**
         * logical_step_1: Declare variable to store a year that we want to check.
         * logical_step_details: A variable year of integer type is declared to store a year to check whether it's a leap year or not. The value of the variable year is initialized to 2020.
         * question_1: What does the following block of the code do?
         * answer_1: Declare variable to store a year that we want to check.
         * question_2: Why is variable year declared?
         * answer_2: A variable year is declared to store the year to check whether it's a leap year or not. 
         * question_3: What year is the value of the variable year initialized to?
         * answer_3: The value of the variable year is initialized to 2020.
         */
        int year = 2020;

        /**
         * logical_step_2: Check whether the year is a leap year or not.
         * logical_step_details: The expression is defined to check whether a year is a leap year or not using a logical operator. Since the expression evaluates to true, the value "Leap Year" is assigned to the string variable leapYear. Therefore, the program prints "Leap Year".
         * question_1:What does the following block of code do?
         * answer_1: Check whether the year is a leap year or not.
         * question_2:  Does the expression evaluate to true?
         * answer_2: Yes, the expression evaluates to true.
         * question_3:  What value will be assigned to the variable leapYear?
         * answer_3: The variable leapYear is assigned "Leap Year".
         * question_4: What does the program print?
         * answer_4: The program prints "Leap Year".
         */
        /**
         * stm_comment: The "OR" operator is true if any of the conditions satisfy whereas the "AND" operator is true if and only if both conditions satisfy.
         * question_1: What is the difference between the "OR" and "AND" operators?
         * answer_1: The "OR" operator is true if any of the conditions satisfy whereas the "AND" operator is true if and only if both conditions satisfy.
         */
        String leapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? "Leap Year" : "Not a Leap year";
        System.out.println(leapYear);

    }
}
