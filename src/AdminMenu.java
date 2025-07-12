import java.util.Scanner;

public class AdminMenu {
    Scanner sc = new Scanner(System.in);

    RegisterUser registerUser;
    Manager manager;
    AdminUserManager adminUserManager;
    AdminIssuedTracker adminIssuedTracker;

    public AdminMenu(RegisterUser registerUser, Manager manager) {
        this.registerUser = registerUser;
        this.manager = manager;
        this.adminUserManager = new AdminUserManager(registerUser, manager);
        this.adminIssuedTracker = new AdminIssuedTracker(manager);
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n====== Admin Menu ======");
            System.out.println("1. Remove User and Return Book");
            System.out.println("2. View Issued Books");
            System.out.println("3. Display Available Books");
            System.out.println("4. Exit Admin Panel");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    adminUserManager.removeUserAndReturnBook();
                    break;
                case 2:
                    adminIssuedTracker.displayIssuedBooks();
                    break;
                case 3:
                    manager.displayAvailableBooks();
                    break;
                case 4:
                    System.out.println("Exiting Admin Panel...");
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
