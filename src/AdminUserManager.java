import java.util.*;

public class AdminUserManager {

    private RegisterUser registerUser;

    public AdminUserManager(RegisterUser registerUser) {
        this.registerUser = registerUser;
    }

    // 1️⃣ Show all registered users
    public void viewUsers() {
        LinkedList<UserData> users = registerUser.getUserList();

        if (users.isEmpty()) {
            System.out.println("❌ No registered users found.");
            return;
        }

        System.out.println("\n📋 Registered Users:\n");

        for (UserData user : users) {
            System.out.println(user);
            System.out.println("-----------------------------");
        }
    }

    // 2️⃣ Remove a user by email
    public void removeUserByEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email of user to remove: ");
        String email = sc.nextLine();

        LinkedList<UserData> users = registerUser.getUserList();
        boolean found = false;

        Iterator<UserData> iterator = users.iterator();

        while (iterator.hasNext()) {
            UserData user = iterator.next();
            if (user.getEmail().equalsIgnoreCase(email)) {
                iterator.remove(); // remove from list
                found = true;
                break;
            }
        }

        if (found) {
            registerUser.RegisteredEmail.remove(email); // also remove from email HashSet
            System.out.println("✅ User removed successfully.");
        } else {
            System.out.println("❌ User not found with that email.");
        }
    }
}
