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
         * logical_step_1: Declares variables to store numbers, sum and the average.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: An array numArray of double type is declared to store numbers. The array numArray is initialized to the value of 8, 6, 11, and 7. The variable sum of double type is declared to hold the sum of the numbers. The value of the sum is initialized to 0. The variable average of double type is declared to hold the value of the average.
         * question_1: What is done to store numbers?
         * answer_1: An array numArray of double types is declared to store numbers.
         * question_2: What value is the array numArray initialized to?
         * answer_2: The array numArray is initialized to value of 8, 6, 11, and 7
         * question_3: What is the variable sum of a double type declared to do?
         * answer_3: The variable sum of double type is declared to hold the sum of the numbers.
         * question_4: What is the value of the sum initialized to?
         * answer_4: The value of the sum is initialized to 0.
         * question_5: What is the variable average of a double type declared to do?
         * answer_5: The variable average of double type is declared to hold the value of the average.
         */
        double[] numArray = {8, 6, 11, 7};
        double sum = 0.0;
        double average;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: Calculate the sum of numbers.
         *  program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: The for loop is used to iterate over each value of the array. During each iteration, the value of the array at index i is added to the value of the sum. When the for loop completes, the value of the sum is 32.
         * question_1: What does the for loop do?
         * answer_2: The for loop is used to iterate over each value of the array.
         * question_2: What happens during each iteration?
         * answer_2: During each iteration, the value of the array at index i is added to the value of the sum.
         * question_3: What is the value of the sum when the for loop completes?
         * answer_3: When the for loop completes, the value of the sum is 32.
         */
        /**
         * stm_comment: numArray.length is used to get the length of the array.
         * question_1: What is numArray.length used for?
         * answer_1: numArray.length is used to get the length of the array.
         */
        for (int i = 0; i < numArray.length; i++) {
            /**
             * stm_comment: numArray[i] is used to acces array element at index i.
             * question_1:  What is numArray[i] used for?
             * answer_1: numArray[i] is used to acces array element at index i.
             */
            sum += numArray[i];
        }

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_3: Calculate the average and print it.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: The average of numbers is calculated by dividing the sum of elements of the array by the length of the array. The length of the array numArray is 5. Therefore, the calculated value of the average is 8.00.
         * question_1: How is the average calculated?
         * answer_1: The average is calculated by dividing the sum of elements of the array by the length of the array.
         * question_2: What is the length of the array?
         * answer_2: The length of the array numArray is 5.
         * question_3: What is the calculated value of the average?
         * answer_3: The calculated value of the average is 8.00.
         */
        average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);

    }
}
