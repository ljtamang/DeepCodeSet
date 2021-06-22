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

public class gridOfStars {
    public static void main(String[] args) {

        /**
         * logical_step_1: Specify the size of the grid in terms of height and width measured in the number of stars.
         * logical_step_details: Declare two integer variables height and width that indicate the size of the grid and initialize them to 3 and 5, respectively.
         * question_1: What does the following block of code do?
         * answer_1: Specify the size of the grid in terms of height and width measured in the number of stars.
         * question_2: What is done to indicate the size of the grid?
         * answer_2: Declare two integer variables height and width that indicate the size of the grid.
         * question_3: What is the height of the grid initialized to?
         * answer_3: The height of the grid is initialized to value 3.
         * question_4: What is the width of the grid initialized to ?
         * answer_4:  The width of the grid is initialized to value 5.
         */
        int height = 3, width = 5;

        /**
         * logical_step_2: Use nested loops to scan the grid and print a star in each cell of the grid.
         * logical_step_details: Uses two for loops to scan the grid one row at a time from left to right and print a star in each cell of the grid. The first for loop is used to scan all rows of the grid using the loop variable row. The second for loop scans all the columns given the current row indicated by the outer loop.
         * question_1: What does the following block of code do?
         * answer_1: Use nested loops to scan the grid and print a star in each cell of the grid.
         * question_2: How many loops do we use?
         * answer_2: We use two for loops.
         * question_3: What is the first for loop used for?
         * answer_3: The first for loop is used to scan all rows of the grid.
         * question_4: What does the second for loop do?
         * answer_4: The second for loop scans all the columns given the current row indicated by the outer loop.
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
             * question_2: How many times does inner loop run?
             * answer_2: The inner loop runs for width iterations.
             */
            for (int col = 0; col < width; col++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

}
