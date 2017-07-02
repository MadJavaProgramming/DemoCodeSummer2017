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
         bookOne.setTitle("Head First Java");
         bookOne.setAuthor("Kathy Sierra & Burt Bates");
         bookOne.setNumberOfPages(688);
         
         // display the book
         bookOne.display();
         
         // create a second book object
         Book bookTwo = new Book();
         
         // set the title, author, and number of pages
         bookTwo.setTitle("PHP Rocks");
         bookTwo.setAuthor("Ken Marks");
         bookTwo.setNumberOfPages(1000);
         
         // display the book
         bookTwo.display();
         
         // assign bookTwo to bookOne
         bookOne = bookTwo;
         
         System.out.println("After bookOne = bookTwo;");
         bookOne.display();
         bookTwo.display();
         
         // change title on bookOne
         bookOne.setTitle("Java Rocks Volume 2");
         System.out.println("After  bookOne.title = Java Rocks Volume 2;");
         bookOne.display();
         bookTwo.display();
         
        
   }




}
