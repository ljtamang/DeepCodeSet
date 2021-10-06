/**
 * author: Vasile Rus, refined by Lasang Tamang
 * topics: nested loops
 * subtopics: two nested for loop
 * goalDescription: Print a grid of stars.
 * source: https://www.cs.umd.edu/~clin/MoreJava/ControlFlow/nested-loops.html
 * input: N/A
 * output:
 *****
 *****
 *****
 */
public class GridOfStars {
    public static void main(String[] args) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_1: Specify the size of the grid in terms of height and width measured in the number of stars.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: Declare two integer variables height and width to indicates the size of the grid. The value of the variable height is initialized to 3. The value of the variable width is initialized to 5.
         * question_1: What is done to indicate the size of the grid?
         * answer_1: Declare two integer variables height and width that indicate the size of the grid.
         * question_2: What value is the variable height initialized to?
         * answer_2: The value of the variable height is initialized to 3.
         * question_3: What value is the variable width initialized to?
         * answer_3: The value of the variable height is initialized to 5.
         */
        int height = 3, width = 5;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: Use nested loops to scan the grid and print a star in each cell of the grid.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: Uses two for loops to scan the grid one row at a time from left to right and print a star in each cell of the grid. The first for loop is used to scan all rows of the grid using the loop variable row. The second for loop scans all the columns given the current row indicated by the outer loop.
         * question_1: How many loops do we use?
         * answer_1: We use two for loops.
         * question_2: What is the first for loop used for?
         * answer_2: The first for loop is used to scan all rows of the grid.
         * question_3: What does the second for loop do?
         * answer_3: The second for loop scans all the columns given the current row indicated by the outer loop.
         */
        /** 
         * stm_comment: This first for loop is called the outer loop. The outer loop runs for height iterations.
         * question_1: What is the first for loop called?
         * answer_1: This first for loop is called the outer loop.
         * question_2: How many times do the outer loop run?
         * answer_2: The outer loop runs for height iterations.
         */
        for (int row = 0; row < height; row++) {
            /**
             * stm_comment: This second for loop is known as the inner or nested loop. The inner loop runs for width iterations.
             * question_1: What is the second for loop called?
             * answer_1: This second for loop is known as the inner or nested loop. 
             * question_2: How many times does the inner loop run?
             * answer_2: The inner loop runs for width iterations.
             */
            for (int col = 0; col < width; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
