/** Demonstrate passing values into methods and returning values
 *  @author pwaite
 */
 
public class MethodDemo {

    /** display whatever is passed into the method
     *  @param inputValue the data to be displayed
     */
     public void displayData(String inputValue) {
         System.out.println("The value is: " + inputValue);
     }
     
     /** returns a greeting
      *  @return the greeting
      */
     public String provideGreeting() {
         return "Hello There";
     }
     
     /** adds two numbers together and returns the sum
      *  @param number1 the first number to add
      *  @param number2 the second number to add
      *  @return the sum of the two input numbers
      */
      public int addThemUp(int number1, int number2) {
          int sum = number1 + number2;
          return sum;
      
      }
      

}
