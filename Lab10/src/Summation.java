//Kristian Hajredinaj ID:113367328
public class Summation {
    public static void main(String [] args){
        int n = 0;
        double sum = 0;


        for (int i=0; i<49; ++i){
            n = i ;
            sum += (n * 2.0 + 1.0) / (n * 2.0 + 3.0);
        }
        System.out.println(sum);
    }
}
