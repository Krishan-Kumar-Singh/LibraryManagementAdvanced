import java.util.Map;

public class AdminIssuedTracker {
    Manager manager;

    public AdminIssuedTracker(Manager manager) {
        this.manager = manager;
    }

    public void displayIssuedBooks() {
        if (manager.IssuedBook.isEmpty()) {
            System.out.println("No books have been issued to any user.");
            return;
        }

        System.out.println("Issued Book List:");

        for (Map.Entry<String, BookData> entry : manager.IssuedBook.entrySet()) {
            String email = entry.getKey();
            BookData book = entry.getValue();

            System.out.println("User Email: " + email);
            System.out.println(book);
            System.out.println("_______________---------______________");
        }
    }
}
