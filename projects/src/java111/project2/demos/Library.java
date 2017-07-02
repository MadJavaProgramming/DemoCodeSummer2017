/** A class to demonstrate using an array of objects (in this case books)
 *  Library holds books
 *  @author pwaite
 */
 
public class Library {
    
    Book[] collection;

    /** method to add new books to the library
     */
    public void addBooks() {
        // instantiate/create my array books
        collection = new Book[3];
        
        // create books and add them to the collection
        collection[0] = new Book();
        collection[0].setTitle("Book 1");
        
        collection[1] = new Book();
        collection[1].setTitle("Book 2");
        
        collection[2] = new Book();
        collection[2].setTitle("Book 3");
    }
    
    /** method to display all the library's books
     */
    public void displayBooks() {
        for (int counter = 0; counter < collection.length; counter++) {
            collection[counter].display();
        }
    }


}
