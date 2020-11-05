/**
 * author: Rabin Banjade
 * topics: Arrays
 * subtopics: Array Initialization, Array Size 
 * goalDescription: This program demonstrates the use of Arrays. In this program we use arrays to find the average of 
    numbers. 
 * source: N/A
 * input: N/A
 * output: 5.0
 */



public class Average {
    public static void main(String[] args) {

        /**
        * logical_step_1: Initialize an array called numbers with integers that you want to calculate average of.
        * logical_step_details: Initialize an array variable with integers to find the average.
        * question_1: What does the following code block do?
        * answer_1: Initializes an array called numbers which consists of integers whose average is to be calculated.
        * question_2: What is the data type of the variable numbers?
        * answer_2: The datatype of the variable numbers is interger array.
        * question_3 : What are the values declared in array variable?
        * answer_3: The values declared in array numbers are: 4,2,4,5,10.
        */


        /**
        * stm_comment: Initialize an integer array called numbers with integers that you want to calculate average of.
        * question_1: What does the following statement do?
        * answer_1: Initializes an integer array called numbers which consists of integers whose average is to be calculated. The array numbers consists of values 4,2,4,5,10.
        
        */

        int[] numbers = {4, 2, 4, 5, 10};


        /**
        * logical_step_2: Initialize the variable called sum to store the value of sum of numbers in an array.
        * logical_step_details: Initialize the variable sum with value zero to store the sum of numbers in the array.
        * question_1: What does the following code block do?
        * answer_1: Initializes a variable called sum to store the sum of various numbers in the array.
        * question_2: What is the data type of the variable sum?
        * answer_2: The datatype of the variable sum is double.

        */


        double sum = 0;
        


        /**
        * logical_step_3: Initialize the variable called counter to count the number of integers in an array.
        * logical_step_details: Initialize the variable counter to count the number of integers in the variable number with zero.
        * question_1: What does the following code block do?
        * answer_1: Initializes a variable called counter to count the number of elements of an array. It is initialized to zero initially.
        * question_2: What is the data type of the variable count?
        * answer_2: The datatype of the variable count is integer.
        * question_3: What is counter variable initialized to?
        * answer_3: Counter variabe is initialized to value zero.
        */


        int counter = 0;


        /**
        * logical_step_3: Iterate through each element of an array and calculate the sum of each elements of array. Also, increase the value of counter which counts the values.
        * logical_step_details: Iterate over the index of array from 0 to length of array and add each elements.
        * question_1: What does the following code block do?
        * answer_1: Iterates over each elements of an array from index 0 to length of array and stores the sum in variable sum. 
        * question_2: What does the statement array.length do?
        * answer_2: Returns the length of the array numbers.
        * question_3: What does '++' do?
        * answer_3: Increases the value of count by 1.
        */


        for (int i = 0; i < numbers.length; i++) {

         /**
         *  stm_comment: each of i-th element of the array number is accessed and added to the variable sum.
         *  The value of i ranges from 0 to length of the array, in our case 5.
         *  question_1: Please explain what does the following line of code do?
         *  answer_1: Accesses the i-th element of array and adds it to the variable sum, which represents the sum of all the numbers of an array.
         *  
         *  */


            sum += numbers[i];
            counter++;
        }


        /**
        * logical_step_4: Declare a double type variable named average which stores the value of sum divided by number of elements of array. 
        * logical_step_details: Variable average stores the value of average of all the elements of array numbers. 
        * question_1: What does the following code block do?
        * answer_1: The code divides the sum with counter and stores the result in variable called average. 
        * question_2: What is the data type of variable average?
        * answer_2: The datatype of the variable average is double.
        * question_3: What is the value of average?
        * answer_3: The value of average is 12.5.
        */


        double average = sum / counter;

        /**
         * logical_step_5: Dislay the average of numbers in an array.
         * logical_step_details: Display the value of average of elements of array numbers
         * question_1: What does the following block of code do?
         * answer_1: Dislay the value of variable average.
         */



        System.out.println(average);
    }
}
