/**
 * author: Lasang Tamang, refind by Dr Vasile Rus
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
         * logical_step_1: It declares variables to represent a sum and a limit up to which we want to add numbers to compute their sum.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: A variable sum of integer type is declared to hold the sum of natural numbers. Also, another variable n of integer type is declared to represent the limit up to which we want to add numbers to find the sum.
         * question_1: Why is variable sum declared and what is its type?
         * answer_1:  A variable sum of integer type is declared to hold the sum of natural numbers.
         * question_2: What does the variable n represent and what is its type?
         * answer_2: Variable n represents the limit up to which we want to add numbers to find their sum.
         */
        int sum = 0;
        int n = 10;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: It finds the sum of natural numbers from 1 to 10 and prints it.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: The value of the variable sum is first initialized to 0. Then, a for loop is used to iterate over all integers from 1 to 10. At each iteration, the current integer i is added to the sum. When the for loop ends, the value of the sum is 55. Finally, the program prints "sum = 55".
         * question_1: What value is the variable sum initialized to?
         * answer_1: The value of sum is initialized to 0.
         * question_2: What integer values is the for loop iterating over?
         * answer_2: The for loop is used to iterate over all integers from 1 to 10.
         * question_3: In each iteration, what happens to variable sum?
         * answer_3: In each iteration, the value of the current integer in the loop variable i is added to the sum.
         * question_4: What is the value of sum when the for loop completes execution?
         * answer_4: When the for loop ends, the value of the sum is 55.
         * question_5: What does the program print?
         * answer_5: the program prints "sum = 55".
         */
        /**
         * stm_comment: The for loop below iterates over all numbers from 1 to n. Because n is 10, the loop iterates over all numbers from 1 to 10. The for loop stops executing when i reach 11.
         * question_1: What numbers does the for loop below iterate over?
         * answer_1: The for loop below iterates over all numbers from 1 to n.
         * question_2: Given that n is 10, in this particular case, what numbers does the for loop iterate over?
         * answer_2: Because n is 10, the loop iterates over all numbers from 1 to 10.
         * question_3: When does the for loop stop executing?
         * answer_3: The for loop stops executing when i reach 11.
         */
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

    }
}
