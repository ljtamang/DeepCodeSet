/**
 * author: Lasang Tamang
 * topics: Nested If
 * subtopics: If, else if, else
 * goalDescription: This program demonstates the use of nested if else condtion. It increment or decement the value of result based on the condtion satsified.
 * source: N/A
 * input: N/A
 * output: -1
 */
public class Tester {
    public static void main(String[] args) {
        
        /**
         * logical_step_1: Declares variables i and result and assigns values.
         * logical_step_details: Declares variables i and result and assigns values. The data types of variable i is integer and the value is 10. The data type of variable result is integer and the value is 0.
         * question_1: What does the following block of code do?
         * answer_1: Declares variables i and result and assigns values.
         * question_2: What the data type and value of i?
         * answer_2: integer, 10
         * question_3: What is the data type and value of result?
         * answer_3: integer, 0
         */
        int i = 2 * 5;
        int result = 0;
        
        /**
         * logical_step_2: checks multiple condition using if-else-if and execute the part of code inside the condtion that satisfy
         * logical_step_details: checks multiple condition using if-else-if and execute the part of code inside the condition that satisfy. The first condition if (i > 5) executes  since i = 10 and 10 > 5 is true. Inside the first if conditon that satisfies, the else condtion is met since i % 2 > 0 is false. The value of result is -1 since result is decremented by 1
         * question_1: What does the following block of code do?
         * answer_1: checks multiple condition using if-else-if and execute the part of code inside the condtion that satisfy.
         * question_2: Which condtion executes among if, else if and else and why?
         * answer_2: The first condtion if (i > 5) executes  since i = 10 and 10 > 5 is true.
         * question_3: What is the value of i modulus 2 and why?
         * answer_3:  The value of i modulus 2 is 0 since 10 modulus 2 equals 0.
         * question_4: Now, inside the first if conditon, which condition is met among if and else, and why?
         * answer_4:  else condtion is met since i % 2 > 0 is false.
         * question_5: What is the value of result and why?
         * answer_5:  The value of result is -1 since result is decremented by 1.
         */
        if (i > 5) { 
            /* stm_comment: When if conditon is true, it executes the block of code inside it.
            *question_1: What happens when if condtion is true?
            *answer_1:  executes the block of code inside it
            */
            if (i % 2 > 0) {
                result++;
            } 
            /* stm_comment: When if conditon is false, it executes the block of code inside else condtion.
            *question_1: What happens when if condtion is false?
            *answer_1:  executes the block of code inside else condtion.
            */
            else {
                result--;
            }
        } else if (i > 2) {
            result = i % 2;
        } else {
            result = 100;
        }
        System.out.println(result);
    }
}
