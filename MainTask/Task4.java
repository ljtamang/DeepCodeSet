/**
 * author: Priti Oli
 * topics: Loop
 * subtopics: for loop
 * goalDescription: This program demonstates the use of for loop. In this program we use, for
 * loop to initialise the value of result to be 2 and then add the sum of natural numbers less than
 * 5 to the value of  result using for loop.
 * source: N/A
 * input: N/A
 * output: 12
 */
public class Tester {
    public static void main(String[] args) {
        /**
         * logical_step_1: Declare an variable result to store result.
         * logical_step_details: Declare an variable result to store result. The data type of variable result is integer. The variable result is initalized to 2
         * question_1: What does the following block of code do?
         * answer_1: Declare an variable result to store result.
         * question_2: What is the data type of the variable result?
         * answer_2: The data type of result is an integer
         * question_3: What value is result intialized ?
         * answer_3:  The variable result is initialized to 2
         */
        int result = 2;

        /**
         * logical_step_2: Add the values from 0 to 4 to the previous value of result.
         * logical_step_detail: Add the values from 0 to 4 to the previous value of result. The initial value of variable i is 0. The body of the for-loop executes 5 times. The value of result when for loop execution completes is 12.
         * The initial value of the variable i is 0. The loop terminates when i >= 5.
         * question_1: What does the following block of code do?
         * answer_1: Add the values from 0 to 4 to the previous value of result.
         * question_2: What is initial value of the variable i?
         * answer_2: the initial value of variable i is 0.
         * question_3: How many times the body of for-loop executes?
         * answer_3: The body of the for-loop executes 5 times.
         * question_4: What is the value of result when for loop execution completes?
         * answer_4:  12
         */

        /**
         *  stm_comment: The for loop has initial value i=10, it checks on whether the value of i is less than 5. If true,
         *  the body of the for loop is executed and the value of the variable result is updated by adding the value of i to it.
         *  question_1: Please explain what the following for loop does.
         *  answer_1: The for loop has initial value i=10, it checks on whether the value of i is less than 5. If true,
         *  the body of the for loop is executed and the value of the variable result is updated by adding the value i to it.
         * */
        for (int i = 0; i < 5; i++) {
            result = result + i;
        }
        System.out.println(result);
    }
}
