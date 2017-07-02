/** Class to demonstrate how to create an array of doubles, populate 
  * the array, and then display items from the array
  * @author pwaite       
  */

public class PrimitiveArrayDemo {
    /** 1. instantiate/create an array of doubles
     *  2. add double values in to the array
     *  3. display the values from the array
     *  @param args the command line arguments
     */
     public static void main(String[] args) {
         //1. instantiate/create an array of doubles
         double[] myListOfDoubles = new double[3];
         
         //2. add double values in to the array
         myListOfDoubles[0] = 40.00;
         myListOfDoubles[1] = 35.99;
         myListOfDoubles[2] = 49.99;
         
         //3. display the values from the array
         System.out.println(myListOfDoubles[0]);
         System.out.println(myListOfDoubles[1]);
         System.out.println(myListOfDoubles[2]);
         System.out.println();
         
         //4. display the values from the array using a loop
         int counter = 0;
         while (counter < myListOfDoubles.length) {
             System.out.println(myListOfDoubles[counter]);
             counter++;
         }
     }




}
