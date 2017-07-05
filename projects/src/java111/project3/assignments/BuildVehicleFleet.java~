/** This class represents a fleet of vehicles
 *  which will be used to emphasize 
 *  Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author pwaite
 */

public class BuildVehicleFleet {

    private VehicleFleet fleet;
    
    /** Create a method to create vehicles
     *  1) Instantiate three Vehicle objects and place them into a LOCAL array
     *  2) Set each vehicles' instance variables using the vehicle's set methods 
     *  3) Set the local array of vehicles into the VehicleFleet's array using
     *     the set method
     */
     
     public void createVehicles() {
         Vehicle[] listOfVehicles = new Vehicle[3];
         listOfVehicles[0] = new Vehicle();
         listOfVehicles[0].setMileage(224000);
         listOfVehicles[0].setMake("Chevy");
         listOfVehicles[0].setYear(2003);
         
         listOfVehicles[1] = new Vehicle();
         listOfVehicles[1].setMileage(80000);
         listOfVehicles[1].setMake("Toyota");
         listOfVehicles[1].setYear(2012);
         
         listOfVehicles[2] = new Vehicle();
         listOfVehicles[2].setMileage(112000);
         listOfVehicles[2].setMake("Toyota");
         listOfVehicles[2].setYear(2008);
     
         fleet.setVehicles(listOfVehicles);
     }
     
     
     
     /** Create a run method that 
      *  1) Instantiates a new VehicleFleet object and assigns it to the
      *     instance variable
      *  2) Calls the method to create the vehicles 
      *  3) Calls the method on the VehicleFleet to calculate average annual
      *     mileage for our fleet
      *  4) Calls the method in the VehicleFleet to display the information
      *     about our vehicles 
      */
      public void run() {
          fleet = new VehicleFleet();
          createVehicles();
          fleet.calculateMileage();
          fleet.display();

      }


}
