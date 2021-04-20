public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 21));
        System.out.println(hasSharedDigit(12, 54));
        System.out.println(hasSharedDigit(-1, 12));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }
        int num1lastDigit = num1 % 10;
        num1 = num1 / 10;
        int num1firstDigit = num1 % 10;

        int num2lastDigit = num2 % 10;
        num2 = num2 / 10;
        int num2firstDigit = num2 % 10;


        if ((num1firstDigit == num2firstDigit || num1firstDigit == num2lastDigit)
                || ((num1lastDigit == num2firstDigit || num1lastDigit == num2lastDigit))) {
            return true;
        } else {
            return false;
        }
    }
}
