/**
 * author: Lasang Tamang 
 * topics: If-Else 
 * subtopics: If-Else 
 * goalDescription: Check Whether a number is Even or Odd.
 * source: https://www.programiz.com/java-programming/examples/even-odd
 * input: N/A
 * output: 9 is odd
 */
public class EvenOdd {
    public static void main(String[] args) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_1: Declare a variable to store a number that we want to check.
         *  program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: A variable num of integer type is declared to store a number to check whether Even or Odd. The variable num is initialized to the value of 9.
         * question_1: What is the data type of the variable num?
         * answer_1: The data type of the variable num is an integer.
         * question_2: What value is the variable num initialized to??
         * answer_2: The variable num is initialized to the value of 9.
         */
        int num = 9;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: Perform a test to check if the number is even or odd and print the result.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: To check whether a number is even or odd, the remainder of the number divisible by 2 is calculated using the % operator. The number is even if the remainder is 0, otherwise, it is odd. In this example, the program prints 9 is odd.
         * question_1: What is done to check if the number is even or odd?
         * answer_1: To check whether a number is even or odd, the remainder of the number divisible by 2 is calculated using the % operator.
         * question_2: What happens if the remainder is 0?
         * answer_2: The number is even if the remainder is 0.
         */
        /**
         * stm_comment: The code block inside the if condition executes when if condition is true. 
         * question_1: What happens if the condition is true?
         * answer_1: The code block inside the if condition executes when if condition is true. 
         */
        if (num % 2 == 0)
            System.out.println(num + " is even");
        /**
         * stm_comment: The code block inside the else condition executes when if condition is false.
         * question_1: When does the else condition execute?
         * answer_1: The code block inside the else condition executes when if condition is false.
         */
        else
            System.out.println(num + " is odd");

    }
}
