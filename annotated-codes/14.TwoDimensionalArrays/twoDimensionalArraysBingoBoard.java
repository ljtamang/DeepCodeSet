/**
* author: Vasile Rus
* topics: two-dimensional arrays
* subtopics: two-dimensional arrays
* goalDescription: Generate a 3 x 3 Bingo board with random numbers from 1 to 25. The board will be populated from the top-left corner, one row at a time, all the way to the bottom right corner.
* source: N/A
* output:
16 15 11 
2 13 21 
10 10 6 
*/
import java.util.Random;
public class twoDimensionalArraysBingoBoard {
    public static void main(String[] args) {

        /**
         * logical_step_1: Declare variables required to make bingo board.
         * logical_step_details: A two-dimensional array of integers is declared to represent the 3 x 3 Bingo board. Also, an instance of the class Random is declared to generate random integers.
         * question_1: What does the following code block do?
         * answer_1: Declare variables required to make bingo board.
         * question_2: What variables are declared?
         * answer_2: A two-dimensional array of integers called bingoBoard and a rand variable which is an instance of the class Random.
         * question_3: What is the size of the two-dimensional array bingoBoard?
         * answer_3: The size of the array is 3 x 3 or 9 cells.	
         */
        int[][] bingoBoard = new int[3][3];
        Random rand = new Random();

        /**
         * logical_step_2: Generate 9 random numbers in the range of 1 to 25 and populate the Bingo board.
         * logical_step_details: Two loops are used to scan all the cells on a Bingo board. The outer loop accounts for the rows of the bingo board.  The inner loop accounts for all the cells in one row of the bingo board. A random number is generated and stored in each scanned cell of the Bingo board.
         * question_1: What does the following code block do?
         * answer_1:  Generate 9 random numbers in the range of 1 to 25 and populate the Bingo board.
         * question_2: What does the outer loop account for?
         * answer_2: The outer loop accounts for the rows of the bingo board.
         * question_3: What does the inner loop account for ??
         * answer_3: The inner loop accounts for all the cells in one row of the bingo board.
         * question_4: What happens to the random number generated?
         * answer_4: A random number generated is stored in each scanned cell of the Bingo board.
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                /**
                 *  stm_comment: bingoBoard[i][j] represents the element in ith row and jth column.
                 *  question_1: What does 	bingoBoard[i][j] represent ?
                 *  answer: bingoBoard[i][j] represents the element in ith row and jth column.
                 */
                bingoBoard[i][j] = rand.nextInt(25);
            }
        }

        /**
         * logical_step_3: Print the Bingo board.
         * logical_step_details: Two for loop is used to scan each cell of the Bingo board from the top left corner to the bottom right corner. Then, the value in each cell of the bingo board is printed.
         * question_1: what does the following code block do?
         * answer_1: Print the Bingo board. 
         * question_2: What are two for loop used for?
         * answer_2: Two for loop is used to scan each cell of the Bingo board from the top left corner to the bottom right corner.
         * question_3: what is printed ??
         * answer_3: The value in each cell of the bingo board is printed.
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(bingoBoard[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
