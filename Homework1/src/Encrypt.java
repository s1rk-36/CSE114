//Kristian Hajredinaj ID: 113367328
import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String encrypt="" , decrypt="";

        System.out.println("Enter the message in encrypted form: ");
        encrypt= s.nextLine();
        
        for(int i=0; i<encrypt.length(); i=i+2){

            if(decrypt.length()>4){
                break;
            }

            decrypt = decrypt + encrypt.charAt(i);
        }
        System.out.println("The message in decrypted form is: "+decrypt);
    }
}
