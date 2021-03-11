/**
 * author:Nisrine Ait Khayi
 * topics: While loop
 * subtopics: Find the first divisor of an integer number
 * goalDescription : This program demonstrates using while loop until certain conditon is met.
 * source: N/A
 * output: 5
*/
public class Tester {
    public static void main(String[] args) {
        /** 
         * logical_step_1: Declares the variables num and integer and assigns values.
         * logical_steps_details: Declare two integer variables num and divisor. 
	 * The value of variable num is initialize to 25. The value of variable divisor is initialized to 2.
         * question_1: What does the following code block do?
         * answer_1:  Declares the variables num and integer and assigns values.
	 * question_2: What is the value of num?
         * answer_2:  25
	 * question_3: What is the value of divisor?
         * answer_2:  2
         */
        int num = 25;
        int divisor = 2;
         
	/**
        * logical_step_2: Executes the while loop and increment the value of divisor by 1 until the condition num modulus divisor is 0 is met.
        * logical_step_details: Executes the while loop and incrment the value of divisor by 1 until the conditon num modulus divisor is 0 is met. 25 % 2 is not equal to 0. So, the loop executes and the value of divisor is 3 when while loop executes first time. The value of divisor is 5 at the end of while loop execution.
        * question_1: What does the following code block do?
        * answer_1: Executes the while loop and increment the value of divisor by 1 until the conditon num modulus divisor is 0 is met.
	* question_2: Is 25 % 2 equal to 0?
        * answer_2: No
	* question_3:  What is the value of divisor when while loop executes for firs time?
        * answer_3: 3
        * question_4:  What is the value of divisor at the end of while loop execution?
        * answer_4: the value of divisor is 5.
        */
        
        /** 
        * stm_comment: While loop execute a block of code as long as a specified condition is reached.
        * question_1: What does while loop do?
        * answer_1: While loop execute a block of code as long as a specified condition is reached.  
        */
        while (num % divisor != 0) {
            divisor += 1;
        }
        System.out.println(divisor);
    }
}
