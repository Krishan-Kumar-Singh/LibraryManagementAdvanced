
import java.util.Scanner;

public class AdminUserManager {
    RegisterUser registerUser;
    Manager manager;
    Scanner sc = new Scanner(System.in);

    public AdminUserManager(RegisterUser registerUser, Manager manager) {
        this.registerUser = registerUser;
        this.manager = manager;
    }

    public void removeUserAndReturnBook() {
        System.out.println("Enter the email of the user you want to remove:");
        String email = sc.nextLine();

        // Step 1: Return the book (if any)
        manager.ReturnBook(email);

        // Step 2: Remove the user
        registerUser.RemoveUser();
    }
}
