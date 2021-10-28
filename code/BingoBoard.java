import java.util.Random;
public class BingoBoard {
    public static void main(String[] args) {

        int[][] bingoBoard = new int[5][5];
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingoBoard[i][j] = 1 + rand.nextInt(75);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(bingoBoard[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
