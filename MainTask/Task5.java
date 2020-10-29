public class Tester {
    public static void main(String[] args) {
        int[] array = {4, 2, 4, 5, 10};
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            counter++;
        }

        double result = sum / counter;
        System.out.println(result);
    }
}
