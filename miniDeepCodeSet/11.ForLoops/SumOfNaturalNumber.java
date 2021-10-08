/**
 * author: Lasang Tamang
 * topic: For Loops
 * subTopic: Using for loops
 * goalDescription: Find the sum of natural numbers from 1 to 10.
 * source: https://www.programiz.com/java-programming/for-loop
 * input: N/A
 * output: Sum = 55
 */
public class SumOfNaturalNumber {
    public static void main(String[] args) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_1: Declare variables to represent a sum and limit up to which we want to find the sum.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: A variable sum of integer type is declared to hold the sum of natural numbers. Also, another variable n of integer type is declared to represent the limit up to which we want to find the sum.
         * question_1: Why is variable sum declared?
         * answer_1:  A variable sum of integer type is declared to hold the sum of natural numbers.
         * question_2: What does the variable n represent?
         * answer_2: Variable n represents the limit up to which we want to find the sum.
         */
        int sum = 0;
        int n = 10;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: Find the sum of natural numbers from 1 to 10 and print it.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: Here, the value of the sum is 0 initially. Then, the for loop is iterated from i = 1 to 10. In each iteration, i is added to the sum and its value is increased by 1. When the for loop completes execution, the value of the sum is 55. Finally, the program prints "sum = 55".
         * question_1: What is the value of sum initially?
         * answer_1: The value of sum is 0 initially.
         * question_2: For what values of i is for loop iterated?
         * answer_2: The for loop is iterated from i = 1 to 10.
         * question_3: In each iteration, what is added to the sum?
         * answer_3: In each iteration, the value of i is added to the sum.
         * question_4: What is the value of sum when for loop complete execution?
         * answer_4: The value of the sum is 55.
         * question_5: What does the program print?
         * answer_5: sum = 55
         */
        /**
         * stm_comment: The for loop stop executing when i becomes 11.
         * question_1: when does the for loop stop executing?
         * answer_1:  The for loop stop executing when i become 11.
         */
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

    }
}
