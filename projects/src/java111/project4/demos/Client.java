/** Client represents a customer lawn for mowing
 *  Provided as an example for a test code demo
 *  @author pwaite
 */
 
public class Client {

    private int length;
    private int width;
    
	/**
	 * Returns the value of length.
	 * @return lawn's length
	 */
	public int getLength() {
		return length;
	}


	/**
	 * Sets the value of length.
	 * @param length The value to assign length.
	 */
	public void setLength(int length) {
		this.length = length;
	}


	/**
	 * Returns the value of width.
	 * @return lawn's width
	 */
	public int getWidth() {
		return width;
	}


	/**
	 * Sets the value of width.
	 * @param width The value to assign width.
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/** 
	 * Determines the area of the lawn
	 * @return lawn area
	 */
	 public int calculateArea() {
	     return length * width;
	 }

	
	

}
