/** Class to test the Library 
 *  @author pwaite
 */
 
public class LibraryTestDrive {

    /** main method 
      * 1. instantiate a library
      * 2. call the method to create/add books
      * 3. display the books
      * @param args the command line arguments
      */
      public static void main(String[] args) {
          Library library = new Library();
          library.addBooks();
          library.displayBooks();
      }
}
