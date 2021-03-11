/**
 * author: Jeevan Chapagain
 * topics: Operator precedence
 * subtopics: multipilcation, modolus operation
 * goalDescription: This program demonstrates the use of operator precedence. IT perform multiplication and division operation based on the precedence of operators.
 * source: N/A
 * input: N/A 
 * output: 1
*/
public class MyTester {
    public static void main(String[] args) {

    	/**
	* logical_step_1: Declare a  variable called i, j and result.
	* logical_step_details: Declare a variable called i,j and results. The data type of the variable i, j and results is integer.
	* Variable i is initialized to a value of 5 and j is initialized to a value of 8. 
	* question_1: What does the following code block do?
	* answer_1: Declare a variable called i,j and results.
	* question_2: What is the data type of the variables i, j and result?
	* answer_2: The data type of the variable i, j and results is integer.
	* question_3: What is the value of variable i and j?
	* answer_3: Variable i is initialized to a value of 5 and j is initialized to a value of 8.
	*/
        int i = 5;
        int j = 8;
        int result;

        /**
	* logical_step_2: Declare a variable called k and store the value after the multiplication of variable i and j and calcualte the result using division and modolus operation  and print the result.
	* logical_step_details: Declare a variable called k and store the value after the multiplication of variable i and j and calcualte the result using division and modolus operation and print the result.
	* Result is calcualted by dividing the variable k by 7 and calculating the modulus 2 of it. The output of the program is 0.
	* question_1: What does the following code block do?
	* answer_1: Declare a variable called k and store the value after the multiplication of variable i and j and calcualte the result using division and modolus operation  and print the result.
	* question_2: How is the result calcualted?
	* answer_2: Result is calcualted by dividing the variable k by 7 and calculating the modulus 2 of it. 
	* question_3: What is the output of the program?
	* answer_3: The output of the program is 0.
        */

	/**
	* stm_comment: Store the multiplication of i and j and store it in a variable k. The data type of the variable k is integer.
	* question_1: Please explain what the following line of code does?
	* answer_1: Store the multiplication of i and j and store it in a variable k.
	* question_2: What is the data type of the variable k?
	* answer_2: The data type of the variable k is integer.
	*/
        int k = j * i;
        /**
		* stm_comment: Divide the variable k by 7 and get the modolous 2.
		* question_1: Please explain what the following line of code does?
		* answer_1: Divide the variable k by 7 and get the modolous 2.
		*/
        result = k / 7 % 2;
        /**
	* stm_comment: Print out the value of the result variable. The value of result is 0.
	* question_1: Please explain what the following line of code does?
	* answer_1: Print out the value of the result variable.
	* question_2: What is the value of result?
	* answer_2: The value of result is 1.
	*/
        System.out.println(result);
    }
}
