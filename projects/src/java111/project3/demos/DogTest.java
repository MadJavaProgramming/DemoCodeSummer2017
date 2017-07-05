/** A class to test the Dog class in Kennel Application
 *  @pawaite
 */

 public class DogTest {
     /** Creates a dog and verifies the food calculation
      *  method works correctly
      *  @param args the command line arguments
      */
      
      public static void main(String[] args) {
          //Instantiate a small Dog object.
          Dog smallDog = new Dog();
          
          //Set the weight of the dog
          smallDog.setWeight(49);
          
          //Run the food needs calculation
          int actualSmallDogFoodNeeded = smallDog.calculateFoodNeeded();
          int expectedSmallDogFoodNeeded = 1;
          
          //Compare the results with what we expect
          if (actualSmallDogFoodNeeded == expectedSmallDogFoodNeeded) {
              //Output “success” or “failure”
              System.out.println("SmallDogCalc successful");
          } else {
              System.out.println("SmallDogCalc FAILED");
          }
           
          // run more tests...
         
          
          //Instantiate a large Dog object.
          Dog largeDog = new Dog();
          
          //Set the weight of the dog
          largeDog.setWeight(50);
          
          //Run the food needs calculation
          int actualLargeDogFoodNeeded = largeDog.calculateFoodNeeded();
          int expectedLargeDogFoodNeeded = 2;
          
          //Compare the results with what we expect
          if (actualLargeDogFoodNeeded == expectedLargeDogFoodNeeded) {
              //Output “success” or “failure”
              System.out.println("LargeDogCalc successful");
          } else {
              System.out.println("LargeDogCalc FAILED");
          }
          
      }
 }
