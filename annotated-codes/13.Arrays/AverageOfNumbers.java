/**
 * author: Lasang Tamang
 * topic: Arrays
 * subTopic: declaring array variables, processing array
 * goalDescription: Program to Calculate average of numbers.
 * source: https://www.programiz.com/java-programming/examples/average-arrays
 * input: N/A
 * output: The average is: 8.00
 */
public class AverageOfNumbers {
    public static void main(String[] args) {

        /**
         * logical_step_1: Declares variables to store numbers and their sum.
         * logical_step_details: An array of double types called numArray is declared to store the numbers of which we want to find the average. Also, a variable called the sum of double type is declared to represent the sum of the numbers. The value of the sum is initialized to 0.
         * question_1: What does the following block of code do?
         * answer_1: Declares variables to store numbers and their sum.
         * question_2: What variables are declared?
         * answer_2: An array of double types called numArray and a variable called the sum of double type is declared.
         * question_3: What is the value of the sum initialized to?
         * answer_3: The value of the sum is initialized to 0.
         */
        double[] numArray = {
            8,
            6,
            11,
            7
        };
        double sum = 0.0;

        /**
         * logical_step_2: Calculate the sum of all elements in the array.
         * logical_step_details: The sum of all elements in the array is calculated using a for-each loop. The for-each loop iterates over each value of the array and adds that value to the sum. At the end of the for-each loop execution, the value of the sum is 32.
         * question_1: What does the following block of code do?
         * answer_1: Calculate the sum of all elements in the array.
         * question_2: What does for-each loop do?
         * answer_2: Calculates the sum of all elements in the array.
         * question_3: What is the value of sum when the for-each loop completes execution?
         * answer_3: When the for-each loop completes execution, the value of the sum 32.
         */
        /**
         * stm_comment: The for loop is used to iterate over each element of the array.
         * question_1: what is the for loop used to do?
         * answer_1:The for loop is used to iterate over each element of the array.
         */
        for (double num: numArray) {
            sum += num;
        }

        /*
         * logical_step_3: Calculate the average and print it.
         * logical_step_details: The average of numbers is calculated by dividing the sum of elements of the array by the length of the array. The value of the sum is 32 and the length of the array is 4. Therefore, the calculated value of the average is 8.00.
         * question_1: What does the following block of code do?
         * answer_1: Calculate the average and print it.
         * question_2: How is the average calculated?
         * answer_2: The average is calculated by dividing the sum of elements of the array by the length of the array.
         * question_3: What is the length of the array?
         * answer_3: Length of the array is 5.
         * question_4: What is the calculated value of the average?
         * answer_4: The calculated value of the average is 8.00.
         */
        /**
         * stm_comment: numArray.length gives the number of elements of the array.
         * question_1: What gives the number of elements of an array?
         * answer_1: numArray.length gives the number of elements of the array.
         */
        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);

    }
}
