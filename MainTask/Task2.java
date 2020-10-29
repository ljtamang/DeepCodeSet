public class Tester {
    public static void main(String[] args) {
        int i = 2 * 5;
        int result = 0;

        if (i > 5) {
            if (i % 2 > 0) {
                result++;
            } else {
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
