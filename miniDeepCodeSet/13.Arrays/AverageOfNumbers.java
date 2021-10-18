/**
 * author: Lasang Tamang
 * topic: Arrays
 * subTopic: array declaration, array initalization, accessing value of an array
 * goalDescription: Calculate average of numbers.
 * source: https://www.programiz.com/java-programming/examples/average-arrays
 * input: N/A
 * output: The average is: 8.00
 */
public class AverageOfNumbers {
    public static void main(String[] args) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_1: It declares variables needed to store numbers, their sum, and average.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: The array variable numArray is declared to store the numbers whose average will be computed. The variable sum is declared to represent the sum of the numbers. The value of the sum is initialized to 0. Also, the variable average of double type is declared to hold the value of the average.
         * question_1: Why is the array variable numArray declared?
         * answer_1: The array variable numArray is declared to store the numbers whose average will be computed. 
         * question_2: Why is a variable sum declared?
         * answer_2: The variable sum is declared to represent the sum of the numbers.
         * question_3: What value is sum initialized to?
         * answer_3: The variable sum is initialized to 0.
         * question_4: Why is variable average declared?
         * answer_4: The variable average is declared to hold the value of the average.
         */
        double[] numArray = { 8, 6,11,7};
        double sum = 0.0;
        double average;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: It calculates the sum of numbers stored in the numArray.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: The sum of numbers is calculated using for loop to iterate over each number of numArray and adding the number to the sum. When the for loop completes execution, the value of the sum is 32.
         * question_1: How is a sum of numbers calculated?
         * answer_1: The sum of numbers is calculated using for loop to iterate over each number of numArray and adding the number to the sum.
         * question_2: What is the value of sum when the for loop completes execution?
         * answer_2: When the for loop completes execution, the value of the sum is 32.
         */
        /**
         * stm_comment: For loop runs for the number of iterations equal to the length of the numArray.
         * question_1: How many times does the for loop run?
         * answer_1: For loop runs for the number of iterations equal to the length of the numArray.
         */
        for (int i = 0; i < numArray.length; i++) {
            /**
             * stm_comment: numArray[i] is used to acces number stored in array numArray at index postion i.
             * question_1: What is numArray[i] used for?
             * answer_1: numArray[i] is used to acces number stored in array numArray at index postion i.
             */
            sum += numArray[i];
        }

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_3: It calculate the average of the numbers and prints it.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: The average of numbers is calculated dividing the sum of elements of the array by the length of the array, which is the number of numbers. The value of the sum of numbers is 32. The length of the array numArray is 5. Therefore, the calculated value of the average is 8.00.
         * question_1: How is the average calculated?
         * answer_1: The average is calculated dividing the sum of elements of the array by the length of the array.
         * question_2: What is the value of the sum of numbers?
         * answer_2: The value of the sum of numbers is 32.
         * question_3: What is the length of the array?
         * answer_3: The length of the array numArray is 5.
         * question_4: What is the calculated value of the average?
         * answer_4: The calculated value of the average is 8.00.
         */
        /**
         * stm_comment: The variable numArray.length provides the number of elements or size of the array.
         * question_1: How can the number of elements or size of the array be obtained?
         * answer_1: The variable numArray.length provides the number of elements or size of the array.
         */
        average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);

    }
}
