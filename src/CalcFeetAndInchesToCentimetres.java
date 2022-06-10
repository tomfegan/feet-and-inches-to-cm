public class CalcFeetAndInchesToCentimetres {
    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double totalInches = (feet * 12) + inches;
            return totalInches * 2.54;
        } else {
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimetres(double inches) {
        if (inches >= 0) {
            double totalFeet = (int) (inches / 12);
            double remainingInches = (int) inches % 12;

            return calcFeetAndInchesToCentimetres(totalFeet, remainingInches);

        } else {
            return -1;
        }
    }
}
