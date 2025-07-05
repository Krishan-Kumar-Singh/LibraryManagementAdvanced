import java.util.*;

public class BookData {

        String BookTitle;
        String AuthorName;
        String Summary;

        public BookData(String BookTitle , String AuthorName , String Summary){

            this.BookTitle= BookTitle;
            this.AuthorName = AuthorName;
            this.Summary = Summary;
        }

             public String getBookTitle() {
             return BookTitle;
             }

             public String getAuthorName() {
             return AuthorName;
             }

             public String getSummary() {
             return Summary;
             }

             public String toString(){

              return "Title :" + BookTitle  +  "\nAuthor Name:"  + AuthorName + "\nSummary : " + Summary;


             }

}