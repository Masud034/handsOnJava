public class Main {
    public static void main(String[] args) {
        AreaCalculator a1 = new AreaCalculator();

        System.out.println(a1.area(5.0));
        System.out.println(a1.area(-1));
        System.out.println(a1.area(5.0, 4.0));
        System.out.println(a1.area(-1.0, 4.0));
    }
}
