import java.util.*;

public class AdminIssuedTracker {

    private Manager manager;

    public AdminIssuedTracker(Manager manager) {
        this.manager = manager;
    }

    // 1️⃣ View all issued books
    public void viewIssuedBooks() {
        HashMap<String, String> issued = manager.IssuedBook;

        if (issued.isEmpty()) {
            System.out.println("❌ No books have been issued yet.");
            return;
        }

        System.out.println("\n📚 Issued Books List:\n");

        for (Map.Entry<String, String> entry : issued.entrySet()) {
            String user = entry.getKey();
            String title = entry.getValue();

            System.out.println("👤 User Name: " + user);
            System.out.println("📘 Book Title: " + title);
            System.out.println("----------------------------------");
        }
    }

    // 2️⃣ Remove issued book by user name
    public void removeIssuedBookByUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the user to revoke issued book: ");
        String user = sc.nextLine();

        HashMap<String, String> issued = manager.IssuedBook;

        if (issued.containsKey(user)) {
            String returnedBook = issued.remove(user); // remove from IssuedBook map
            manager.BooksList.put(returnedBook, new BookData(returnedBook, "Unknown", "No summary")); // basic restore

            System.out.println("✅ Issued book '" + returnedBook + "' removed and returned to library.");
        } else {
            System.out.println("❌ No book found issued to this user.");
        }
    }
}
