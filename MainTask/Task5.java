/**
 * author: Rabin Banjade
 * topics: Arrays
 * subtopics: Array Initialization, Array Size 
 * goalDescription: This program demonstrates the use of Arrays. In this program we use arrays to find the average of numbers. 
 * source: N/A
 * input: N/A
 * output: 5.0
 */



public class Average {
    public static void main(String[] args) {

        /**
        * logical_step_1:Initialize an collection integers whose average is to be calculated.
        * logical_step_details: Initialize an array called numbers with integers that you want to calculate the average of.
        * question_1: What does the following code block do?
        * answer_1: Initialize an collection integers whose average is to be calculated.
        * question_2: What is the data type of the variable numbers?
        * answer_2: The datatype of the variable numbers is interger array.
        * question_3 : What are the values declared in array variable?
        * answer_3: The values declared in array numbers are: 4,2,4,5,10.
        */


        /**
        * stm_comment: An array initializer is written as a comma-separated list of expressions, enclosed by braces { and }.In the code below
         * the the values of integer array numbers is specified using array initializer
        * question_1: What does the following statement do?
        * answer_1: the the values of integer array numbers is specified using array initializer
        
        */

        int[] numbers = {4, 2, 4, 5, 10};


        /**
        * logical_step_2: Initialize the variable called sum to store the value of sum of numbers in an array and variable counter to count the number of elements of array.
        * logical_step_details: Initialize the variable sum and integer variable count with value zero to store the sum of numbers in the array.
        * question_1: What does the following code block do?
        * answer_1: Initializes a variable called sum to store the sum of all numbers in the array and variable count to count the number of elements of array.
        * question_2: What is the data type of the variable sum?
        * answer_2: The datatype of the variable sum is double.
        * question_3: What is the data type of variable counter?
        * answer_3: The data type of variable counter is integer
        */


        double sum = 0;
        int counter = 0;


        /**
        * logical_step_3: Iterate through each element of an array to calculate the sum of each elements of array numbers.
        * question_1: What does the following code block do?
        * answer_1: Iterate through each element of an array to calculate the sum of each elements of array numbers.
        * question_2: How many times does the for-loop execute.
        * answer_2: the for loop executes 5 times.
        * question_3: What is the value of numbers.length?
        * answer_3: the value of numbers.length is 5.
         * question_3: What is the value of numbers[0]?
         * answer_3: the value of numbers[0] is 4.
        */


        for (int i = 0; i < numbers.length; i++) {

         /**
         *  stm_comment: each of i-th element of the array number is accessed using index operator [] and added to the variable sum.
         *  The value of i ranges from 0 to length of the array, in our case 5.
         *  question_1: Please explain what does the following line of code do?
         *  answer_1: each of i-th element of the array number is accessed using index operator [] and added to the variable sum.
          *  The value of i ranges from 0 to length of the array, in our case 5.
         *  
         *  */


            sum += numbers[i];
            counter++;
        }


        /**
        * logical_step_4: Declare a double variable to compute and store the average of numbers.Display the value of average
        * logical_step_details: Variable average stores the value of average of all the elements of array numbers. 
        * question_1: What does the following code block do?
        * answer_1:  Declare a double variable to compute and store the average of numbers.Display the value of average.
        * question_2: What is the data type of variable average?
        * answer_2: The datatype of the variable average is double.
        * question_3: What is the value of average?
        * answer_3: The value of average is 12.5.
        */

        double average = sum / counter;
        
        System.out.println(average);
    }
}
