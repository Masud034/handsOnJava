public class FeetAndInchesToCentimeter {
    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {
        if (feet >= 0) {
            if (inches >= 0 && inches <= 12) {
                double inCentimeter = (feet * 30.48) + (inches * 2.54);
                System.out.println(+feet + " Feet " + inches + " Inches = " + inCentimeter + " Cm");
                return inCentimeter;
            } else {
                System.out.println("Invalid Choice");
                return -1;
            }
        } else {
            System.out.println("Invalid Choice");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeter(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(+inches + " Inches = " + feet + " Feet " + remainingInches + " Inches");
            return calcFeetAndInchesToCentimeter(feet, remainingInches);
        } else {
            System.out.println("Invalid Choice");
            return -1;
        }
    }
}
