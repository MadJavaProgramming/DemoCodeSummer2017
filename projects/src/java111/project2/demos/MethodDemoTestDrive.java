/** Class provides a way to run the MethodDemo
 *  @author pwaite
 */
 
public class MethodDemoTestDrive {

    /** Instantiate a MethodDemo object and call methods on it.
      * @param args The command line arguments
      */
      
    public static void main(String[] args) {
        MethodDemo demo = new MethodDemo();
        
        // call the displayData method
        String someValue = "hello everyone!";
        demo.displayData(someValue);
    
        // call the provideGreeting method
        String returnedGreeting = demo.provideGreeting();
        System.out.println("The greeting is " + returnedGreeting);
        
        // call the addThemUp method
        int returnedSum = demo.addThemUp(60, 80);
        System.out.println("The answer is " + returnedSum);
    
    }
    
}

