public class Main {
    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        simpleCalculator.setFirstNumber(10.5);
        simpleCalculator.setSecondNumber(2);

        System.out.println("Addition Result: " +simpleCalculator.getAdditionResult());
        System.out.println("Subtraction Result: " +simpleCalculator.getSubtractionResult());
        System.out.println("Multiplication Result: " +simpleCalculator.getMultiplicationResult());
        System.out.println("Division Result: " +simpleCalculator.getDivisionResult());
    }
}
