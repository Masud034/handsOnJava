public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(45654));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int varNumber = number;
        int reverse = 0;

        while (varNumber > 0) {
            int lastDigit = varNumber % 10;
            reverse *= 10;
            reverse += lastDigit;
            varNumber /= 10;
        }
        if (number == reverse) {
            return true;
        } else
            return false;
    }
}
