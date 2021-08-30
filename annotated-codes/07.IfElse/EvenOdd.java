/**
 * author: Lasang Tamang 
 * topics: If-Else 
 * subtopics: If-Else 
 * goalDescription: Check Whether a number is Even or Odd
 * source: https://www.programiz.com/java-programming/examples/even-odd
 * input: N/A
 * output: 9 is odd
 */
public class EvenOdd {
    public static void main(String[] args) {

        /**
         * logical_step_1: Declare a variable to represent a number that we want to check.
         * logical_step_details: A variable num of integer type is declared to represent a number to check whether Even or Odd. The num is assigned the value of 9.
         * question_1: What does the following block of the code do?
         * answer_1: Declare a variable to represent a number that we want to check.
         * question_2: Why is variable num declared?
         * answer_2: A variable num is declared to represent a number to check whether Even or Odd.
         * question_3: What is the data type of num?
         * answer_3: The data type of num is an integer.
         * question_4: What value is assigned to num?
         * answer_4: The num is assigned the value of 9.
         */
        int num = 9;

        /**
         * logical_step_1: Perform a test to check if the number is even or odd and print the result.
         * logical_step_details: To check whether a number is even or odd, the remainder of the number divisible by 2 is calculated using the % operator. The number is even if the remainder is 0, otherwise, it is odd. In this example, the program prints 9 is odd.
         * question_1: What does the following block of the code do?
         * answer_1:  Perform a test to check if the number is even or odd and print the result.
         * question_2: What is done to check if the number is even or odd?
         * answer_2: To check whether a number is even or odd, the remainder of the number divisible by 2 is calculated using the % operator.
         * question_3: What happens if the remainder is 0?
         * answer_3: The number is even if the remainder is 0.
         */
        /**
         * stm_comment: The code block inside the if condition executes when if a condition is true. 
         * question_1: What happens if the condition is true?
         * answer_1: The code block inside the if condition executes when if a condition is true. 
         */
        if (num % 2 == 0)
            System.out.println(num + " is even");
        /**
         * stm_comment: The code block inside the else condition executes when if the condition is false.
         * question_1: When does the else condition execute?
         * answer_1: The code block inside the else condition executes when the condition is false.
         */
        else
            System.out.println(num + " is odd");

    }
}
