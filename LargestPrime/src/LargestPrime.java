public class LargestPrime {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(6));
        System.out.println(getLargestPrime(15));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime(int number) {

        if (number <= 0) {
            return -1;
        }
        int largestPrime = 0;
        int flag = 0;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                if (isPrime(i)) {
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }

    public static boolean isPrime(int number) {

        int flag = 0;
        for (int j = 2; j <= Math.sqrt(number) ; j++) {
            if (number % j == 0) {
                flag = 1;
            }
        }
        return flag == 0;
    }
}
