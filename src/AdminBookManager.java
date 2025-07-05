import java.util.Scanner;
import java.util.Map;

public class AdminBookManager {

    Manager manager;

    public AdminBookManager(Manager manager) {
        this.manager = manager;
    }

    // 1️⃣ Add a new book
    public void addBook() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Book Summary: ");
        String summary = sc.nextLine();

        if (manager.BooksList.containsKey(title)) {
            System.out.println("❌ Book already exists.");
            return;
        }

        BookData newBook = new BookData(title, author, summary);
        manager.BooksList.put(title, newBook);
        System.out.println("✅ Book added successfully.");
    }

    // 2️⃣ Remove a book
    public void removeBook() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title to remove: ");
        String title = sc.nextLine();

        if (manager.BooksList.containsKey(title)) {
            manager.BooksList.remove(title);
            System.out.println("✅ Book removed successfully.");
        } else {
            System.out.println("❌ Book not found.");
        }
    }

    // 3️⃣ View all books
    public void viewBooks() {
        if (manager.BooksList.isEmpty()) {
            System.out.println("📚 No books in the library.");
            return;
        }

        System.out.println("\n📚 Available Books:\n");
        for (Map.Entry<String, BookData> entry : manager.BooksList.entrySet()) {
            System.out.println(entry.getValue().toString());
            System.out.println("----------------------------------");
        }
    }
}
