/** Represents an Audio Book
 *  @author pwaite
 */
 
public class AudioBook extends Book {
 
    private String narrator;
    private int lengthInMinutes;
    

	/**

	 * Returns the value of narrator.

	 * @return Name of the narrator.
	 */

	public String getNarrator() {

		return narrator;

	}





	/**

	 * Sets the value of narrator.

	 * @param narrator The value to assign narrator.

	 */

	public void setNarrator(String narrator) {

		this.narrator = narrator;

	}





	/**

	 * Returns the value of lengthInMinutes.

	 * @return length of recording in minutes
	 */

	public int getLengthInMinutes() {

		return lengthInMinutes;

	}





	/**

	 * Sets the value of lengthInMinutes.

	 * @param lengthInMinutes The value to assign lengthInMinutes.

	 */

	public void setLengthInMinutes(int lengthInMinutes) {

		this.lengthInMinutes = lengthInMinutes;

	}

	
	/** Returns the audio book details
	 *  @return the audio book's details
	 */
	 public String toString() {
	     return super.toString() + " Narrated by " + narrator + 
	             " and is " + lengthInMinutes + " minutes long.";
	 }
	 
	 /** Displays the audio book's type
	 *  @return the audio book's type
	 */
	 public String displayType() {
	    return "The book is an audio book";
	}
	
	 /** specifies the period of time the item
     *  can be loaned out
     *  @return loan period
     */
    public int determineLoanPeriod() {
        // code here to determine loan period
        // based onpopularity of the book
        // and number of copies in stock
        return 14;
    }


}
	
    
