public class Main {
    public static void main(String[] args) {
        DecimalComparator dc = new DecimalComparator();

        System.out.println(dc.areEqualByThreeDecimalPlaces(0.001, 0.002));
        System.out.println(dc.areEqualByThreeDecimalPlaces(4.00115, 4.252));
        System.out.println(dc.areEqualByThreeDecimalPlaces(4.295740, 4.29547));
    }
}
