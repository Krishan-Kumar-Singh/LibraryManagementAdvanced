import java.util.*;
public class AdminLogin {

    public boolean Login() {
        Scanner sc = new Scanner(System.in);

        String AdminUsername = "Krishn";
        String AdminPasscode = "157639";


        System.out.println("What is the Admin Name?");
        String Username = sc.nextLine();

        System.out.println("What is the Passcode?");
        String Passcode = sc.nextLine();

        if (Username.equals(AdminUsername) && Passcode.equals(AdminPasscode)) {

            System.out.println("Login Successfully!!");
            return true;

        }

        else{

            System.out.println("Wrong Credentials");
            return false;

        }


    }


}
