/**
 * author: Vasile Rus, refined by Lasang Tamang
 * topics: while loops
 * subtopics: a loop with simple loop variable increment
 * goalDescription: Find the smallest divisor of a positive number.
 * source: N/A
 * input: N/A
 * output: Smallest divisor of 15 is 3
 */
public class SmallestDivisor {
    public static void main(String[] args) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_1: Define variables to represent a number and its divisor.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: Variable num represents the positive number whose smallest divisor is to be found. The value of the variable num is initialized to 15. Variable divisor represents the smallest divisor of the given positive number.
         * question_1: What does variable num represent?
         * answer_1:  Variable num represents the positive number whose smallest divisor is to be found.
         * question_2: What value is variable num initialized?
         * answer_2: The value of variable num is initialized to 15.
         * question_3: What does variable divisor represent?
         * answer_3: Variable divisor represents the smallest divisor of the given positive number.
         */
        int num = 15;
        int divisor = 2;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: Find the smallest divisor of the number num and print it.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: A while loop generates a potential divisor candidate from 2 to the number itself. The while loop ends when the remainder of the division between num and divisor is zero, which means the value of divisor is the smallest divisor of num. At each iteration, the divisor's value is incremented by 1.
         * question_1: What does the while loop do?
         * answer_2: A while loop generates a potential divisor candidate from 2 to the number itself.
         * question_2: When does the while loop end?
         * answer_2: The while loop ends when the remainder of the division between num and divisor is zero, which means the value of divisor is the smallest divisor of num. 
         * question_3: What happens at each iteration??
         * answer_3: At each iteration, the divisor's value is incremented by 1.
         */
        /**
         * stm_comment: The While loop runs as long as the rest of the dividing num by the divisor is different from zero. 
         * question_1: How long does the while loop run?
         * answer_1: The While loop runs as long as the rest of dividing num by divisor is different from zero.
         */
        while (num % divisor != 0) {
            divisor += 1;
        }
        System.out.println("Smallest divisor of " + num + " is " + divisor);

    }
}
