import java.util.*;

public class Manager {
    HashMap<String, BookData> BooksList;
    HashMap<String, BookData> IssuedBook;


    public Manager() {
        BooksList = new HashMap<>();
        IssuedBook = new HashMap<>();

    }

    public void AvailableBooks() {
        BooksList.put("Harry Potter", new BookData("Harry Potter", "JK rollings", "Harry is a boy with magic......"));

        BooksList.put("BirdBox", new BookData("BirdBox", "Josh Malerman", "A mother keeps her children inside a house blindfolded why......"));

        BooksList.put("The Count of Monte Cristo", new BookData(("The Count of Monte Cristo"), "Alexandre Dumas", "A sailor who got betrayed and than we found treasure...."));

        BooksList.put("The Angry River", new BookData("The Angry River", "Ruskin Bond", "A girl who lives with her grandparents on an island and the river got angry....."));

        BooksList.put("Frankenstein", new BookData("Frankenstein", "Mary Shelley", "A scientist created a monster, only to know that real monsters are humans......"));

        BooksList.put("The Umbrella", new BookData("The Umbrella", "Ruskin Bond", " A girl with blue umbrella runs on mountains , story of (kindness,jealousy,forgiveness).... "));
    }

    public void IssueAvailableBook(String userName, String bookTitle) {

        if (!BooksList.containsKey(bookTitle)) {

            System.out.println("Sorry the book you asked for isn't available in our Library!");
            return;

        }

        for(BookData book : IssuedBook.values()){
            if(book.getBookTitle().equals(bookTitle)){

                System.out.println("Sorry the book you are looking for is already issued by Existing user!");
                return;

            }
        }



        BookData book = BooksList.get(bookTitle);
        IssuedBook.put(userName, book);
        BooksList.remove(bookTitle);

        System.out.println("Book :" + bookTitle + "Has been issued to :" + userName);


    }

    public void displayAvailableBooks() {
        if (BooksList.isEmpty()) {
            System.out.println("No books are currently available in the library.");
        } else {
            System.out.println("Available Books in the Library:");
            for (Map.Entry<String, BookData> entry : BooksList.entrySet()) {
                System.out.println("Title: " + entry.getKey());
                System.out.println(entry.getValue());
                System.out.println("----------------------------");
            }
        }
    }

    public boolean isBookPresent(String title){
        return BooksList.containsKey(title);
    }

    public void AddBook(BookData book){
         BooksList.put(book.getBookTitle(), book);
    }

    public void ReturnBook(String email){

        if(IssuedBook.containsKey(email)){
            BookData book = IssuedBook.get(email);

            BooksList.put(book.getBookTitle(), book);

            IssuedBook.remove(email);

            System.out.println("Book Returned from :" + email);

        }

        else{
            System.out.println("This user has no book issued");
        }


    }



}