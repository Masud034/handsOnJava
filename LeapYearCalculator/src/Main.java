public class Main {
    public static void main(String[] args) {
        LeapYear l1 = new LeapYear();

        System.out.println(l1.isLeapYear(1700));
        System.out.println(l1.isLeapYear(1800));
        System.out.println(l1.isLeapYear(1900));
        System.out.println(l1.isLeapYear(2100));
        System.out.println(l1.isLeapYear(2200));
        System.out.println(l1.isLeapYear(2300));
        System.out.println(l1.isLeapYear(2500));
        System.out.println(l1.isLeapYear(2600));

        System.out.println(l1.isLeapYear(1600));
        System.out.println(l1.isLeapYear(2000));
        System.out.println(l1.isLeapYear(2400));
    }
}
