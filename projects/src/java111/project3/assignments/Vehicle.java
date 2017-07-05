/** This class represents a vehicle
 *  which will be used to emphasize 
 *  Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author pwaite
 */

public class Vehicle {

    private String make;
    private int year;
    private int mileage;

	
    /**

	 * Returns the value of make.

	 * @return vehicle make
	 */

	public String getMake() {

		return make;

	}





	/**

	 * Sets the value of make.

	 * @param make The value to assign make.

	 */

	public void setMake(String make) {

		this.make = make;

	}





	/**

	 * Returns the value of year.

	 * @return the vehicle's year
	 */

	public int getYear() {

		return year;

	}





	/**

	 * Sets the value of year.

	 * @param year The value to assign year.

	 */

	public void setYear(int year) {

		this.year = year;

	}





	/**

	 * Returns the value of mileage.

	 * @return vehicle mileage
	 */

	public int getMileage() {

		return mileage;

	}





	/**

	 * Sets the value of mileage.

	 * @param mileage The value to assign mileage.

	 */

	public void setMileage(int mileage) {

		this.mileage = mileage;

	}



    
    /** Create a method to calculate
     *  the average number of miles the vehicle
     *  was driven per year.  This value will be a double
     *
     *  @return average mileage per year
     */
     
     public double calculateAverageMileage() {
         int currentAge = 2017 - year;
         return (double)mileage / currentAge;   
     }
      
     /** Create a method, display(), that returns a String containing the 
      *  vehicle information. It should include all instance variables and 
      *  average mileage per year. 
      *  
      *  @return vehicle details
      */
      
      public String display() {
          String vehicleDetails = "Make: " + make + " Year: " + year + 
                " Mileage: " + mileage + " Average Mileage per year " +
                calculateAverageMileage();
          return vehicleDetails;
      
      }
      



}
