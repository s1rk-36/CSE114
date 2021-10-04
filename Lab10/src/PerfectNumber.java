//Kristian Hajredinaj  ID: 113367328
public class PerfectNumber {
    public static void main(String [] args){
        for (int i=1; i<10000; ++i) {
            int number = 0;
            for (int k=1; k<i; ++k){
                if(i%k == 0){
                    number += k;
                }
            }
            if(number == i){
                System.out.println(i);
            }
        }

    }
}
