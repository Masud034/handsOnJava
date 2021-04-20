public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(9));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = number;

        while (number >= 10) {
            number = number / 10;
            firstDigit = number;
        }
        return firstDigit + lastDigit;
    }
}
