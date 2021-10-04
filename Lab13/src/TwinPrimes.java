//Kristian Hajredinaj ID: 113367328
public class TwinPrimes {
    public static void main(String [] args) {
        for (int i = 0; i < 1000; i++) {
            if (isTwinPrime(i) && isTwinPrime(i+ 2))
                System.out.println("(" + i + "," + (i+2) + ")");
        }
    }
    public static boolean isTwinPrime(int n){
        int count = 0;
        for (int i = 1; i <= n; i++){
            if(n % i ==0)
                count ++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }
}

