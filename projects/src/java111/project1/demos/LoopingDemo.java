/** A class to demonstrate looping. 
 *  @author pwaite    
 */
public class LoopingDemo {
    /** The main method to run our program 
     *  The method will create a counter and perform 
     *  looping logic based on the value
     *  @param args command line arguments
     */
    public static void main(String[] args){ 
        int myCount = 10;
        while (myCount > 0) {
            System.out.println("myCount is: " + myCount);
            myCount--; //is equivalent to myCount = myCount - 1;
        }
    }
}
