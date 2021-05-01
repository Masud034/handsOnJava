import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to round to floor value: ");
        
        BigDecimal number = new BigDecimal(scanner.nextLine());
        System.out.println(number.setScale(0, RoundingMode.FLOOR));

    }
}