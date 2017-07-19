/** Test drive used to demonstrate 
 *  polymorphism: specifically what methods are 
 *  available to an object reference
 *
 *  @author pwaite
 */
 
public class SnowboardTestDrive {

    /** Instantiate snowboards using
     *  two different object reference types
     *  to demonstrate which methods are availabe.
     */
    
    public static void main(String[] args) {
        Snowboard snowboard1 = new Snowboard();
        snowboard1.getAir();
        System.out.println(snowboard1.toString());
        
        Object snowboard2 = new Snowboard();
        //snowboard2.getAir();
        System.out.println(snowboard2.toString());
    }
    
}
