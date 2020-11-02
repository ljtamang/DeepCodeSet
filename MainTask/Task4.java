/**
 * author: Priti Oli
 * topics: Loop
 * subtopics: for loop
 * goalDescription: This program demonstates the use of for loop. In this program we use, for
 * loop to find initialise the value of result to be 2 and then add the sum of natural numbers less than
 * 5 to the value of  result using for loop.
 * source: N/A
 * input: N/A
 * output: 12
 */
public class Tester {
    public static void main(String[] args) {
        /**
         * logical_step_1: Specify the initial value of result.
         * logical_step_details: Declares an integer variable result and result and assigns it's values to be 2.
         * question_1: What does the following block of code do?
         * answer_1: Specify the initial value of result.
         * question_2: What the data type?
         * answer_2: result is an integer
         * question_3: What is the value of the variable result?
         * answer_3: the value of result is 2
         */
        int result = 2;

        /**
         * logical_step_2: add the value of natural numbers less than 5 to the previous value of result
         * logical_step_detail: add the value of each natural number which is less than 5 to the previous value of the result
         * and update the value of the variable result
         * question_1: What does the following block of code do?
         * answer_1: add the value of natural numbers less than 5 to the previous value of result
         * question_2: How many times is the body of for loop executed
         * answer_2: The body of the for loop is executed 5 times
         * question_3: What is the value of  result when i=1
         * answer_3:  the value of result is 3
         * question_4: what is initial value of the variable i?
         * answer_4:  i=0
         * question_5: what is the loop termination criteria for the for loop given below
         * answer_5:  i >= 5
         */

        /**
         *  stm_comment: the for loop has initial value i=10, it checks on whether the value of i iis less than 5.if true
         *  the body of the for loop is executed and the value of the variable result is updated by adding the value it to it.
         *   question_1:Please explain what the following for loop does?
         *  answer_1: the for loop has initial value i=10, it checks on whether the value of i iis less than 5.if true
         *  the body of the for loop is executed and the value of the variable result is updated by adding the value it to it.
         * */

        for (int i = 0; i < 5; i++) {
            result = result + i;
        }
        /**
         * logical_step_3: Display the value of result.
         * logical_step_details: Display the value of result in the output stream
         * question_1: What does the following block of code do?
         * answer_1: Display the value of result.
         * question_2: What value will be displayed in the screen?
         * answer_2: The value of the variable result will be displayed
         * question_3: what is the value of result?
         * answer_3: the value of result is 12
         */
        System.out.println(result);
    }
}
