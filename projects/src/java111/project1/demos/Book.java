/** A class representing book
  *  to demonstrate our first class
  * @author pwaite
  */

public class Book {

    String title;

    String author;

    int numberOfPages;

    /** method to display book information
     */

    public void display() {

        System.out.println("The book info:");

        System.out.println("Title: " + title);

        System.out.println("Author(s): " + author);

        System.out.println("Pages: " + numberOfPages);

        System.out.println();

    }

}
