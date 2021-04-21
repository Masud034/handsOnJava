public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
        numberToWords(1010);
        numberToWords(-12);
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            count++;
            number = number / 10;
        } while (number > 0);

        return count;
    }

    public static int reverse(int number) {
        int flag = 0;
        if (number < 0) {
            flag = -1;
        }

        number = Math.abs(number);
        int varNumber = number;
        int reverse = 0;

        while (varNumber > 0) {
            int lastDigit = varNumber % 10;
            reverse *= 10;
            reverse += lastDigit;
            varNumber /= 10;
        }
        if (flag == -1)
            return flag * reverse;
        else
            return reverse;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number);
        int countDiff = getDigitCount(number) - getDigitCount(reversedNumber);

        do {
            int remainder = reversedNumber % 10;
            reversedNumber = reversedNumber / 10;

            switch (remainder) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        while (reversedNumber > 0);

        if (countDiff > 0) {
            for (int i = 0; i < countDiff; i++) {
                System.out.println("Zero");
            }
        }
    }
}

