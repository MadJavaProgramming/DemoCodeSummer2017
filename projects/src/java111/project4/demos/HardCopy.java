/** Represents a hard-copy book 
 * @author pwaite
 */

public class HardCopy extends Book {
    private String physicalLocation;
    private boolean hardcover;
    private int numberOfPages;

	/**
	 * Returns the value of physicalLocation.
	 * @return physical location of the book
	 */

	public String getPhysicalLocation() {
		return physicalLocation;
	}
	/**
	 * Sets the value of physicalLocation.
	 * @param physicalLocation The value to assign physicalLocation.
	 */

	public void setPhysicalLocation(String physicalLocation) {
		this.physicalLocation = physicalLocation;
	}
	
	/**
	 * Returns the value of hardcover.
	 * @return indicator whether the book is hardcover or not
	 */

	public boolean getHardcover() {
		return hardcover;
	}

	/**
	 * Sets the value of hardcover.
	 * @param hardcover The value to assign hardcover.
	 */

	public void setHardcover(boolean hardcover) {
		this.hardcover = hardcover;
	}
	/**
	 * Returns the value of numberOfPagse.
	 * @return the numberOfPages
	 */

	public int getNumberOfPages() {
		return numberOfPages;
	}
	/**
	 * Sets the value of numberOfPages.
	 * @param numberOfPages The value to assign numberOfPages.
	 */

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}	
	
	/** Displays the HardCopy book information
	 *  @return HardCopy details
	 */
	public String toString() {
	    String bookDetail = super.toString() + " It has " + numberOfPages + " pages, located at " +
	            physicalLocation + " and is hardcover: " + hardcover;
	    return bookDetail;
	}
	
	/** Displays the hardcopy type
	 *  @return the hardcopy type
	 */
	 public String displayType() {
	    return "The book is a hard copy";
	}
	
	/** specifies the period of time the item
     *  can be loaned out
     *  @return loan period
     */
    public int determineLoanPeriod() {
        // code here to determine loan period
        // based onpopularity of the book
        // and number of copies in stock
        return 28;
    }
}
