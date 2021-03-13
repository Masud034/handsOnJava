public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        //shifting the decimal point to the right 3 places
        num1 = num1 * 1000;
        num2 = num2 * 1000;

        //converting it into int to get rid off the unnecessary fractional part
        num1 = (int) num1;
        num2 = (int) num2;

        //converting that int into double number with 3 decimal places
        num1 = num1 / 1000;
        num2 = num2 / 1000;

        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
}