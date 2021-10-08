/**
 * author: Vasile Rus, refined by Lasang Tamang
 * topics: two-dimensional arrays
 * subtopics: two-dimensional arrays, accesing value of two-dimensional arrays
 * goalDescription: Generate and print a 5 x 5 Bingo board with random numbers from 1 to 75.
 * source: N/A
 * output: non-deterministic
 */
import java.util.Random;
public class BingoBoard {
    public static void main(String[] args) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_1: Declare variables required to make bingo board.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: A two-dimensional array of integers is declared to represent the 3 x 3 Bingo board. Also, an instance of the class Random is declared to generate random integers.
         * question_1: What variables are declared?
         * answer_1: A two-dimensional array of integers called bingoBoard and a rand variable which is an instance of the class Random.
         * question_2: What is the size of the two-dimensional array bingoBoard?
         * answer_2: The size of the array is 5 x 5 or 25 cells.	
         */
        int[][] bingoBoard = new int[5][5];
        Random rand = new Random();

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: Generate 25 random numbers in the range of 1 to 75 and populate the Bingo board.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: Two loops are used to scan all the cells on a Bingo board. The outer loop accounts for the rows of the bingo board. The inner loop accounts for all the cells in one row of the bingo board. A random number is generated and stored in each scanned cell of the Bingo board.
         * question_1: What does the outer loop account for?
         * answer_1: The outer loop accounts for the rows of the bingo board.
         * question_2: What does the inner loop account for ??
         * answer_2: The inner loop accounts for all the cells in one row of the bingo board.
         * question_3: What happens to the random number generated?
         * answer_3: A random number generated is stored in each scanned cell of the Bingo board.
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                /**
                 *  stm_comment: bingoBoard[i][j] represents the element in ith row and jth column.
                 *  question_1: What does bingoBoard[i][j] represent ?
                 *  answer: bingoBoard[i][j] represents the element in ith row and jth column.
                 */
                bingoBoard[i][j] = 1 + rand.nextInt(75);
            }
        }

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_3: Print the Bingo board.
         * * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: Two for loop is used to scan each cell of the Bingo board from the top left corner to the bottom right corner. Then, the value in each cell of the bingo board is printed.
         * question_1: What are two for loop used for?
         * answer_1: Two for loop is used to scan each cell of the Bingo board from the top left corner to the bottom right corner.
         * question_2: What is printed ??
         * answer_2: The value in each cell of the bingo board is printed.
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(bingoBoard[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
