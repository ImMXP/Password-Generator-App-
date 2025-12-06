import java.util.Random;

public class passwords {
    Random r = new Random();
    private String[] passwords;    
    public passwords(){
        passwords = new String[]
        {"a","b","c","d","@","f","g","h","i",
         "j","!","l","m","n","o","p","q","r",
         "s","d","y","u","v","w","x","u","z",
         "k","$","%","&","*","e"
        };
    }
    public void generateLowerCasePassword(int length){
        String x = "";
        for (int i = 0; i < length; i++) {
            x += passwords[r.nextInt(passwords.length)];
        }
        System.out.println("Your password is: " + x);
    }
    public void generateUpperCasePassword(int length){
        String x = "";
        for (int i = 0; i < length; i++) {
            x += passwords[r.nextInt(passwords.length)];
        }
        System.out.println("Your password is: " + x.toUpperCase());
    
    }
    public void generateLowerCaseAndUpperCasePassword(int length){
        String x = "";
        for (int i = 0; i < length; i++) {
            x += passwords[r.nextInt(passwords.length)];
            if(x.length() >= length)
                {
                break;
                }
            else
            x += passwords[r.nextInt(passwords.length)].toUpperCase();
        }
        System.out.println("Your password is: " + x);
    
    }
}

