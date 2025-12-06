import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        passwords plsMakePassword = new passwords();
        System.out.print("Welcome to my password generator app\nChoose the length for new password (Please make it greater than 6 or least that 18)\nInput: ");
        int length;
        try {
            length = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error : invalid input please try again .");
            return;
        }
        if(length < 6 || length > 18){
            System.out.println("Error : (Please make it greater than 6 or least that 18) .");
            System.exit(0);
        }
        else{
        plsMakePassword.generateLowerCasePassword(length);
        plsMakePassword.generateUpperCasePassword(length);
        plsMakePassword.generateLowerCaseAndUpperCasePassword(length);
        }
        
    }
}
