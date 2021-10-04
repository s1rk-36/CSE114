//Kristian Hajredinaj SBU ID:113367328
import java.lang.Math;
public class VehiclePlate {
    public static void main(String [] args){
        int number1 = (int) (1 + Math.random() * 9);
        int number2 = (int) (1 + Math.random() * 9);
        int number3 = (int) (1 + Math.random() * 9);
        int number4 = (int) (1 + Math.random() * 9);
        int n = (int) (65 + Math.random() * 26);
        char c = (char) n;
        int n1 = (int) (65 + Math.random() * 26);
        char c1 = (char) n1;
        int n2 = (int) (65 + Math.random() * 26);
        char c2 = (char) n2;
        System.out.println(String.valueOf(c) + String.valueOf(c1) + String.valueOf(c2) + Integer.valueOf(number1) + Integer.valueOf(number2)+ Integer.valueOf(number3) +Integer.valueOf(number4) );
    }
}
