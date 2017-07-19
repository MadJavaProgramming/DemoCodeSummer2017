/** Unit test for the Client calculations
 *  Provided as a demonstration of unit testing in 
 *  Project 3
 * @author pwaite
 */
 
public class ClientCalculationsTest {

    /** Unit tests for the Client calculations:
     *  lawn area, base weekly charge,  service charge,
     *  total season charge, per payment amount
     *  
     * @param args the command line args
     */
     
     public static void main(String[] args) {
         // 1. Test lawn area calculation
         // 1.1 instantiate the class to be tested
         Client areaTestClient = new Client();
         
         // 1.2 set any values necessary for the test
         areaTestClient.setLength(10);
         areaTestClient.setWidth(20);
         
         // 1.3 create a variable for the expected value
         int expectedArea = 200;
         
         // 1.4 create a variable for the actual value returned by
         //   the method we are testing
         int actualArea = areaTestClient.calculateArea();
     
         // 1.5 compare actual to expected and write out a success
         //    or fail message
         if (expectedArea == actualArea) {
             System.out.println("Area calculation test: SUCCESS"); 
         } else {
             System.out.println("Area calculation test: FAILED"); 
         }
         
         // Repeat for all calculations AND conditions 
     }

}
