/**
 * author:Nisrine Ait Khayi
 * topics: Mathematics
 * subtopics: Find the first divisor of an integer number
 * goalDescription : This program computes the first divisor of a given integer number
 * source: N/A
 * output: 5
*/
public class Tester {
    public static void main(String[] args) {
        /** 
         * logical_step_1: specify an integer number and inialize its divisor to 2.
         * logical_steps_details: Declare two integer variables num and divisor  and initialize them to 25 and 2, respectively.
         * question_1: What does the following code block do?
         * answer_1: Specifies the type and the inialized values of the intger number and its adivisor.
         */
        int num = 25;
        int divisor = 2;
         /**
        * logical_step_2: Use a while loop to find the first advisor of the given integer number num.
        * logical_step_details: Use a while loop to find the first advisor of the given integer number num starting from the value of 2 and increment it until finding the first divisor.
        * question_1: What does the following code block do?
        * answer_1: Use a while loop to find the first advisor of the intger number num.        
        */
        
        /** 
        * stm_comment: This the while loop that finds the first divisor of the integer num. 
        * question_1: When does the loop stops?
        * answer_1: when the reminder of dividing num by divisor is null.        
        * question_3: How many times does the while loop run?
        * answer_3: The while loop runs for a number of iterations until the reminder of dividing num by divisor is null.
        */
        while (num % divisor != 0) {
            divisor += 1;
        }
        
        /**
		* stm_comment: The next statement is needed in order to print the value of the first divisor of the integer num.
		* question_1: What is the printed value?
		* answer_1: The printed values is 5.
		*/
        System.out.println(divisor);
    }
}
