/** Test drive to create books
 *  @author pwaite
 */
 
public class BookTestDrive {

    /** create 2 book objects and display them
     *  @param args the command line arguments
     */
     public static void main(String[] args) {
         // create a book object
         Book bookOne = new Book();
         
         // set the title, author, and number of pages
         bookOne.title = "Head First Java";
         bookOne.author = "Kathy Sierra & Burt Bates";
         bookOne.numberOfPages  = 688;
         
         // display the book
         bookOne.display();
         
         // create a second book object
         Book bookTwo = new Book();
         
         // set the title, author, and number of pages
         bookTwo.title = "PHP Rocks";
         bookTwo.author = "Ken Marks";
         bookTwo.numberOfPages  = 1000;
         
         // display the book
         bookTwo.display();
     }




}
