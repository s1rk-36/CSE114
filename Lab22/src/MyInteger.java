//Kristian Hajredinaj ID:113367328

public class MyInteger {

    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public boolean isEven(){
        return (getValue() % 2) == 0;
    }

    public boolean isOdd(){
        return (getValue() % 2) != 0;
    }

    public boolean isPrime(){
        int count = 0;
        for (int i = 1; i <= getValue(); i++){
            if(getValue() % i ==0)
                count ++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }

    public static boolean isEven(int value){
        return (value % 2) == 0;
    }

    public static boolean isOdd(int value){
        return (value % 2) != 0;
    }

    public static boolean isPrime(int value){
        int count = 0;
        for (int i = 1; i <= value; i++){
            if(value % i ==0)
                count ++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }

    public static boolean isEven(MyInteger integer) {
        return integer.isEven();
    }

    public static boolean isOdd(MyInteger integer) {
        return integer.isOdd();
    }

    public static boolean isPrime(MyInteger integer) {
        return integer.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.value;
    }
}
