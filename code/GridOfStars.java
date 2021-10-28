public class GridOfStars {
    public static void main(String[] args) {

        int height = 3, width = 5;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
