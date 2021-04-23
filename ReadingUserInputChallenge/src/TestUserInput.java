import java.util.Scanner;

public class TestUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 10) {

            System.out.println("Enter number #" + count + ":");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;

            } else {
                System.out.println("Invalid Input. Please try number #" + count + " again.");
                System.out.println();
            }
            scanner.nextLine();
        }
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
