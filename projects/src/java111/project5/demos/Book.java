package java111.project5.demos;
/** Book class representing a general book 
 * @author pwaite
 */
 
public abstract class Book implements Loanable {
    private String title;
    private String author;
    private int isbn;

	private int numberOfCopies;
	
	public Book() {
	    System.out.println("In the book constructor");
	}

	/**

	 * Returns the value of isbn.

	 * @return isbn
	 */

	public int getIsbn() {

		return isbn;

	}



	/**

	 * Sets the value of isbn.

	 * @param isbn The value to assign isbn.

	 */

	public void setIsbn(int isbn) {

		this.isbn = isbn;

	}

	/**
	 * Returns the value of title.
	 * @return book's title
	 */

	public String getTitle() {
		return title;
	}

	/**
	 * Sets the value of title.
	 * @param title The value to assign title.
	 */

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Returns the value of author.
	 * @return the Author's name
	 */

	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the value of author.
	 * @param author The value to assign author.
	 */

	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Returns the value of numberOfCopies.
	 * @return number of copies
	 */

	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	/**
	 * Sets the value of numberOfCopies.
	 * @param numberOfCopies The value to assign numberOfCopies.
	 */

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	/** Displays the book information
	 *  @return the book's details
	 */
	public String toString() {
	    String bookDetail = title + " by " + author + " has ISBN " +
	            isbn + " and we have " + numberOfCopies + " copies.";
	    return bookDetail;
	}
	/** Displays the book's type
	 *  @return the book's type
	 */
	public abstract String displayType();
	
}
