public class LeapYear {
    public static void main(String[] args) {

        int year = 2020;
        String leapYear;

        leapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? "Leap Year" : "Not a Leap year";
        System.out.println(leapYear);

    }
}
