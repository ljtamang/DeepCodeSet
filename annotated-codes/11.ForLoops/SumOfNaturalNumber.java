/**
 * author: Lasang Tamang
 * topic: For Loops
 * subTopic: Using for loops
 * goalDescription: Program to find the sum of natural numbers from 1 to 10.
 * source: https://www.programiz.com/java-programming/for-loop
 * input: N/A
 * output: Sum = 55
 */
public class SumOfNaturalNumber {
  public static void main(String[] args) {
      
	  /**
      * logical_step_1: Declare variables to represent a sum and limit up to which we want to find the sum.
      * logical_step_details: A variable sum of integer type is declared to represent the sum of natural numbers. Also, another variable n of integer type is declared to represent the limit up to which we want to find the sum.
      * question_1: What does the following block of code do?
      * answer_1: Declare variables to represent a sum and limit up to which we want to find the sum.
      * question_2: What variables are declared?
      * answer_2: variables of integer types called sum and n.
      * question_3: What does the variable n represent?
      * answer_3: limit up to which we want to find the sum of.
      */
      int sum = 0;
      int n = 10;

      /**
      * logical_step_2: Find the sum of natural numbers from 1 to 10 and print it.
      *logical_step_details: Here, the value of the sum is 0 initially. Then, the for loop is iterated from i = 1 to 10. In each iteration, i is added to the sum and its value is increased by 1. When the for loop completes execution, the value of the sum is 55. Finally, the program prints "sum = 55".
      *question_1: What does the following block of code do?
      *answer_1: Find the sum of natural numbers from 1 to 10 and print it.
      *question_2: What is the value of sum initially?
      *answer_2: The value of sum is 0 initially.
      *question_3: For what values of i is for loop iterated?
      *answer_3: The for loop is iterated from i = 1 to 10.
      *question_4: In each iteration, what is added to the sum?
      *answer_4: In each iteration, the value of i is added to the sum.
      *question_5: What is the value of sum when for loop complete execution?
      *answer_5: the value of sum is 55.
      *question_6: What does program print?
      *answer_6: sum = 55
      */
	  /**
      *  stm_comment: The for loop stop executing when i becomes 11.
      *  question_1: when does the for loop stop executing ?
      *  answer_1:  The for loop stop executing when i becomes 11.
      */
      for (int i = 1; i <= n; ++i) {
        sum += i; 
      }
      System.out.println("Sum = " + sum);

   }
}
