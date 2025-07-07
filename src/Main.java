import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegisterUser registerUser = new RegisterUser();
        Manager manager = new Manager();
        manager.AvailableBooks(); // Load books
        AdminLogin adminLogin = new AdminLogin();

        while (true) {
            System.out.println("\n=======__________==========_________=========");
            System.out.print("Who are you? (R = Register New User, A = Admin, E = Exit): ");
            String role = sc.nextLine().trim().toUpperCase();

            switch (role) {
                case "R":
                    registerUser.RegisterNewUser();

                    System.out.println("\nHere is the book list:");
                    manager.displayAvailableBooks();

                    System.out.print("Which book do you want to issue? ");
                    String bookTitle = sc.nextLine();

                    System.out.print("Enter your name again to issue: ");
                    String userName = sc.nextLine();

                    manager.IssueAvailableBook(userName, bookTitle);
                    break;

                case "A":
                    if (adminLogin.Login()) {
                        AdminMenu adminMenu2 = new AdminMenu(registerUser, manager);
                        adminMenu2.showMenu();
                    }
                    break;

                case "E":
                    System.out.println("Exiting system... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid input. Please enter R, A, or E.");
            }
        }
    }
}
