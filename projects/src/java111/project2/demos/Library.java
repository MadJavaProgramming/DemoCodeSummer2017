/** A class to demonstrate using an array of objects (in this case books)
 *  Library holds books
 *  @author pwaite
 */
 
public class Library {
    
    private Book[] collection;

	/**
	 * Sets the value of collection.
	 * @param collection The value to assign collection.
	 */
	public void setCollection(Book[] collection) {
		this.collection = collection;
	}


    
    
    /** method to display all the library's books
     */
    public void displayBooks() {
        for (int counter = 0; counter < collection.length; counter++) {
            collection[counter].display();
        }
    }


}
