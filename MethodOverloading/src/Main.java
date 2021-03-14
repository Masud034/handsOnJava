public class Main {
    public static void main(String[] args) {
        FeetAndInchesToCentimeter obj1 = new FeetAndInchesToCentimeter();

        obj1.calcFeetAndInchesToCentimeter(10, 10);
        obj1.calcFeetAndInchesToCentimeter(10, -10);
        obj1.calcFeetAndInchesToCentimeter(-10 , 10);
        obj1.calcFeetAndInchesToCentimeter(-10, -10);
        obj1.calcFeetAndInchesToCentimeter(100);
    }
}
