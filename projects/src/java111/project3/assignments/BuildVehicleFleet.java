import java.util.*;
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
         ArrayList<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
         Vehicle vehicle1 = new Vehicle();
         vehicle1.setMileage(224000);
         vehicle1.setMake("Chevy");
         vehicle1.setYear(2003);
         
         Vehicle vehicle2 = new Vehicle();
         vehicle2 = new Vehicle();
         vehicle2.setMileage(80000);
         vehicle2.setMake("Toyota");
         vehicle2.setYear(2012);
         
         Vehicle vehicle3 = new Vehicle();
         vehicle3 = new Vehicle();
         vehicle3.setMileage(112000);
         vehicle3.setMake("Toyota");
         vehicle3.setYear(2008);
     
         listOfVehicles.add(vehicle1);
         listOfVehicles.add(vehicle2);
         listOfVehicles.add(vehicle3);
         
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
