import java.util.Scanner;

public class AdminBookManager {

    Manager manager = new Manager();

    public void AddingBooks() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Book Title:");
            String title = sc.nextLine();

            if (manager.isBookPresent(title)) {
                System.out.println("The book you want to add already exists.");
            } else {
                System.out.println("Enter Book Author:");
                String author = sc.nextLine();

                System.out.println("Enter Book Description:");
                String description = sc.nextLine();

                BookData newBook = new BookData(title, author, description);
                manager.AddBook(newBook);

                System.out.println("Book added successfully!");
            }

            System.out.println("Do you want to add another book? (yes-no)");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Exiting to Admin Menu");
    }
}
