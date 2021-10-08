/**
 * author: Lasang Tamang 
 * topics: Logical Operator 
 * subtopics: Logical AND, Logical OR, ternary operator 
 * goalDescription: Checks whether a year is a leap year or not.
 * source: N/A
 * input: N/A
 * output: Leap Year
 */
public class LeapYear {
    public static void main(String[] args) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_1: It declares variables to store and check whether the year is a leap year or not.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: A variable year of integer type is declared to store a year. The value of the variable year is initialized to 2020. Also, the variable leapYear of string type is defined.
         * question_1: What is the type of variable year?
         * answer_1: The variable year is of type integer. 
         * question_2: What value is the variable year initialized to?
         * answer_2: The value of the variable year is initialized to 2020.
         * question_3: What is the type of variable leapYear?
         * answer_3: The variable leapYear is of type string. 
         */
        int year = 2020;
        String leapYear;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: It checks and prints whether the year is a leap year or not.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: The expression is defined using a logical operator to check whether the year is a leap year or not. Since the expression evaluates to true, the value "Leap Year" is assigned to the string variable leapYear. Therefore, the program prints "Leap Year".
         * question_1: What is done to check whether a year is a leap year or not?
         * answer_1: The expression is defined using a logical operator to check whether the year is a leap year or not.
         * question_2: Does the expression evaluate to true?
         * answer_2: Yes, the expression evaluates to true.
         * question_3: What value will be assigned to the variable leapYear?
         * answer_3: The variable leapYear is assigned the string "Leap Year".
         * question_4: What does the program print?
         * answer_4: The program prints "Leap Year".
         */
        /**
         * stm_comment: The "OR" operator is true if any of the conditions satisfy whereas the "AND" operator is true if and only if both conditions satisfy.
         * question_1: What is the difference between the "OR" and "AND" operators?
         * answer_1: The "OR" operator is true if any of the conditions satisfy whereas the "AND" operator is true if and only if both conditions satisfy.
         */
        leapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? "Leap Year" : "Not a Leap year";
        System.out.println(leapYear);

    }
}
