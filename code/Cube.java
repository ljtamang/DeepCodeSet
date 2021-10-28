public class Cube {

    static int vol(int x) {
        return x * x * x;
    }

    public static void main(String args[]) {

        int sideLength = 3;
        int vol;

        vol = Cube.vol(sideLength);
        System.out.println(vol);

    }
}
