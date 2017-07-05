/** ProcessLibrary used to create books and add them
 *  to a library's collection.
 *  @author pwaite
 */

public class ProcessLibrary {
    private Library library;
    
    /** 1. Create a local array of books
        2. Create the book objects in the array
        3. Set values into the book instance variables
        4. Set the array in the library using the set method
     */
    public void create() {
        Book[] books = new Book[3];
        // create books and add them to the collection
        books[0] = new Book();
        books[0].setTitle("Book 1");
        
        books[1] = new Book();
        books[1].setTitle("Book 2");
        
        books[2] = new Book();
        books[2].setTitle("Book 3");
        
        System.out.println("I'm at line 26");
        System.out.println("Here's library" + library);
        library.setCollection(books);
        System.out.println("I'm at line 28");
    }
    
    /** instantiate the Library and 
     *  call the create method
     *  call the display method on the library
     */
    public void run() {
        // instantiate the library (instance variable)
        create();
        library = new Library();
        
        
        
        library.displayBooks();
    }
} 
