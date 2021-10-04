//Kristian Hajredinaj ID:113367328
public class Summation {
    public static void main(String[] args) {
        double lowerRange  =  1.0;
        double higherRange = 20.0;
        System.out.println("\ni         m(i)     ");
        for (double i = lowerRange; i <= higherRange; i++) {
            System.out.printf("%-10.0f", i);
            System.out.printf("%7.4f\n", summation(i));
        }
    }
    public static double summation(double n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += i / (i + 1);
        }
        return sum;
    }
}
