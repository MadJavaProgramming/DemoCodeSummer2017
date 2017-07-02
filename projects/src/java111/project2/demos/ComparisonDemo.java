/** Demonstrate comparing primitives versus objects (Strings)
  * @author pwaite
  */

public class ComparisonDemo {

    /**  1. create primitive variables
      *  2. compare primitives
      *  3. create 2 Strings (objects)
      *  4. compare those two String .equals()
      *  @param args the command line arguments
      */
      public static void main (String[] args) {
          int firstNumber = 400;
          int secondNumber = 4399;
          if (firstNumber == secondNumber) {
              System.out.println("The primitive values are the same");
          } else {
              System.out.println("The primitive values are NOT the same");
          }
          
          String myNameOne = "Joe";
          String myNameTwo = "Steph";
          if (myNameOne.equals(myNameTwo)) {
              System.out.println("The String values are the same");
          } else {
              System.out.println("The String values are NOT the same");
          }
      
      }
}
