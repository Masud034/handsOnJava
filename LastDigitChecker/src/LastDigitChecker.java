public class LastDigitChecker {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(20, 30, 55));
        System.out.println(hasSameLastDigit(10, 30, 55));
        System.out.println(hasSameLastDigit(20, 33, 55));
        System.out.println(hasSameLastDigit(20, 30, 50));
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {

        if (isValid(numberOne) && isValid(numberTwo) && isValid(numberThree)) {
            int count = 1;

            if (numberOne % 10 == numberTwo % 10) {
                count++;
            } else if (numberOne % 10 == numberThree % 10) {
                count++;
            } else if (numberTwo % 10 == numberThree % 10) {
                count++;
            }

            if (count >= 2) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}
