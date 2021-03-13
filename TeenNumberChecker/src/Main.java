public class Main {
    public static void main(String[] args) {

        TeenNumberChecker tnc = new TeenNumberChecker();

        System.out.println(tnc.hasTeen(13, 16, 19));
        System.out.println(tnc.hasTeen(13, 20, 22));
        System.out.println(tnc.hasTeen(10, 45, 12));
    }
}
