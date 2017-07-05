import java.util.*;

/** This class represents a fleet of vehicles
 *  which will be used to emphasize 
 *  Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author pwaite
 */

public class VehicleFleet {

    //private Vehicle[] vehicles;
    private ArrayList<Vehicle> vehicles;

    private double fleetAnnualAverageMileage;

	
    /**

	 * Returns the value of fleetAnnualAverageMileage.

	 * @return annual average fleet mileage
	 */

	public double getFleetAnnualAverageMileage() {

		return fleetAnnualAverageMileage;

	}


       
    /**

	 * Sets the value of vehicles.

	 * @param vehicles The value to assign vehicles.

	 */

	public void setVehicles(ArrayList<Vehicle> vehicles) {

		this.vehicles = vehicles;

	}
   
    
    /** Create a method to calculate
     *  the average number of miles the fleet of vehicles
     *  was driven per year (annual average mileage).   
     */
     
     public void calculateMileage() {
         fleetAnnualAverageMileage = 0;
         for (int counter = 0; counter < vehicles.size(); counter++) {
             fleetAnnualAverageMileage = fleetAnnualAverageMileage + 
                    vehicles.get(counter).calculateAverageMileage();
         } 
         
         // this is the enhanced for loop version of lines 55-58 above
        
         for (Vehicle element : vehicles) {
             fleetAnnualAverageMileage = fleetAnnualAverageMileage + 
                    element.calculateAverageMileage();
         }
         
     }
     
     
     /** Create a method that prints out our vehicle fleet information
      *  1) Loop through the array and call the display() method on each vehicle
      *  2) Print the total average annual mileage for our entire fleet to the
      *     terminal window
      */
      
      public void display() {
         for (int counter = 0; counter < vehicles.size(); counter++) {
            System.out.println(vehicles.get(counter).display());
         } 
         System.out.println("The average fleet mileage is: " + 
                fleetAnnualAverageMileage);

      }



}
