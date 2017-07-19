import java.util.*;
/** Test drive to test the book system classes
 * @author pwaite
 */

public class BookTestDrive {

    /** Main will...
     *  1. instantiate a book
     *  2. instantiate a hardcopy
     *  3. set values on each
     *
     *  @param args the command line arguments
     */
     public static void main(String[] args) {
         // 0. Create an arraylist for all kinds of books
         ArrayList<Book> books = new ArrayList<Book>();
         
         // 1. instantiate a book
         Book book = new HardCopy();
         
         // 2. instantiate a hardcopy
         HardCopy hardCopyBook = new HardCopy();
         
         // 3. instantiate an audio book
         AudioBook audioBook = new AudioBook();
         
         // 4. instantiate an eBook
         EBook eBook = new EBook();
         
         // 5. set values on each
         book.setTitle("Once We Were Brothers");
         book.setAuthor("Ronald Balson");
         book.setIsbn(63663333);
         book.setNumberOfCopies(20);
         
         hardCopyBook.setTitle("The Associate");
         hardCopyBook.setAuthor("John Grisham");
         hardCopyBook.setIsbn(83736368);
         hardCopyBook.setNumberOfCopies(10);
         hardCopyBook.setPhysicalLocation("A5S10");
         hardCopyBook.setHardcover(true);
         hardCopyBook.setNumberOfPages(400);
         
         audioBook.setTitle("The Associate");
         audioBook.setAuthor("John Grisham");
         audioBook.setIsbn(83736369);
         audioBook.setNumberOfCopies(1);
         audioBook.setLengthInMinutes(10000);
         audioBook.setNarrator("John Grisham");
         
         eBook.setTitle("The Associate");
         eBook.setAuthor("John Grisham");
         eBook.setIsbn(83736370);
         eBook.setNumberOfCopies(7);
         eBook.setCharacterCount(23039338);
         eBook.setUrl("http://privateLibrary/83736370");
         
         // 6. Add objects to the list
         books.add(eBook);
         books.add(audioBook);
         books.add(hardCopyBook);
         books.add(book);
         
         // 7. iterate over the book list and display each book
         for (Book item : books) {
             System.out.println(item);
             //System.out.println(item.toString());
             // line 68 and 67 are equivalent.
         }
     }
}
