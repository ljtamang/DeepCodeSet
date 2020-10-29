public class Tester {
    public static void main(String[] args) {
        int num = 25;
        int divisor = 2;
        while (num % divisor != 0) {
            divisor += 1;
        }
        System.out.println(divisor);
    }
}
