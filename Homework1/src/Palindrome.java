//Kristian Hajredinaj SBU ID:113367328

import java.util.Scanner;
public class Palindrome {
    public static void main(String []args){

        int number;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a 5-digit number: ");
        number =input.nextInt();

        while(!(number/10000>=1 && number/100000<1)){

            System.out.println("The number entered is not five-digits.");
            System.out.println("Enter a 5-digit number: ");
            number=input.nextInt();
        }
        Palindrome p = new Palindrome();
        p.pal(number);
        input.close();

    }

    public void pal(int num){

        int[] temp = new int[5];
        int actnum = num;

        for(int i=0;i<5;i++){

            temp[i]= num%10;
            num=num/10;
        }

        if(temp[0]==temp[4] && temp[1]==temp[3]){

            System.out.println("Number "+actnum+" is palindrome.");
        }
        else{
            System.out.println("Number "+actnum+" is not palindrome.");
        }


    }


}