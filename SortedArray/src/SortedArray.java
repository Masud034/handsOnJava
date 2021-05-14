import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = getIntegers(scanner.nextInt());
        int temp ;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        printArray(numbers);
    }

    public static int[] getIntegers(int num) {
        Scanner scanner = new Scanner(System.in);

        int numbers[] = new int[num];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return numbers;
    }

    public static void printArray(int numbers[]) {
        System.out.println(Arrays.toString(numbers));
    }
}
