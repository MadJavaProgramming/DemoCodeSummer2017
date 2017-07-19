package java111.project5.demos;

/** Represents an electronic book - eBook
 * @author pwaite
 */

public class EBook extends Book {

    private String url;
    private int characterCount;
    public static int count;

    /** Creates an EBook
     */
    public EBook() {
        count++;
        System.out.println("In the EBook constructor");
    }
    
    /** Creates an EBook and assigns url and character count
     */
    public EBook(int newCharacterCount, String newUrl) {
        this();  // super() = to call super constructor
        System.out.println("In the EBook constructor with url and cc");
        url = newUrl;
        characterCount = newCharacterCount;
    }
	/**

	 * Returns the value of url.
	 * @return the url of the ebook
	 */

	public String getUrl() {

		return url;

	}





	/**

	 * Sets the value of url.

	 * @param url The value to assign url.

	 */

	public void setUrl(String url) {

		this.url = url;

	}





	/**

	 * Returns the value of characterCount.
	 * @return number of characters in the ebook.
	 */

	public int getCharacterCount() {

		return characterCount;

	}





	/**

	 * Sets the value of characterCount.

	 * @param characterCount The value to assign characterCount.

	 */

	public void setCharacterCount(int characterCount) {

		this.characterCount = characterCount;

	}



	/** 
	 *  Returns the ebook's information
	 *  @return ebook's details
	 */
	 public String toString() {
	     return super.toString() + "Has " + characterCount + "characters" +
	             " and is located at " + url + " We have a total of " + count +
	             " ebooks right now";
	 }
	 
	 /** Displays the eBook type
	 *  @return the eBook type
	 */
	 public String displayType() {
	    return "The book is an ebook";
	}
	
	/** specifies the period of time the item
     *  can be loaned out
     *  @return loan period
     */
    public int determineLoanPeriod() {
        // code here to determine loan period
        // based onpopularity of the book
        // and number of copies in stock
        return 21;
    }

}
