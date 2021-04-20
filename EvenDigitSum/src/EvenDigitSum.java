public class EvenDigitSum {
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(1234));
        System.out.println(getEvenDigitSum(-526));
        System.out.println(getEvenDigitSum(12));
        System.out.println(getEvenDigitSum(1234485));
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int isEven;

        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            isEven = number % 10;
            number = number / 10;

            if (isEven % 2 == 0) {
                sum += isEven;
            }
        }
        return sum;

    }
}
