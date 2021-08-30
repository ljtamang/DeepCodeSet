/**
 * author: Vasile Rus, refined by Lasang Tamang
 * topics: while loops
 * subtopics: a loop with simple loop variable increment
 * goalDescription: Find the smallest divisor (other than 1) of a positive number.
 * source: N/A
 * input: N/A
 * output: Smallest divisor of 15 is 3
 */
public class SmallestDivisor {
    public static void main(String[] args) {

        /**
         * logical_step_1: Define variables to represent a number and its divisor.
         * logical_step_details: Variable num represents the positive number whose smallest divisor is to be found. The value of the variable num is initialized to 15. Variable divisor represents the smallest divisor of the given positive number.
         * question_1: What does the following block of code do?
         * answer_1: Define variables to represent the number and its divisor.
         * question_2: What does variable num represent?
         * answer_2:  Variable num represents the positive number whose smallest divisor is to be found.
         * question_3: What value is variable num initialized?
         * answer_3: The value of variable num is initialized to 15.
         * question_4: What does variable divisor represent?
         * answer_4: Variable divisor represents the smallest divisor of the given positive number.
         */
        int num = 15;
        int divisor = 2;

        /**
         * logical_step_2: Find the smallest divisor of the number num and print it. 
         * logical_step_details: A while loop is used to generates a potential divisor candidate from 2 to the number itself. The while loop ends when the remainder of the division between num and divisor is zero, which means the value of divisor is the smallest divisor of num. At each iteration, the divisor's value is incremented by 1.
         * question_1: What does the following block of code do?
         * answer_1: Find the smallest divisor of the number num and print it. 
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
