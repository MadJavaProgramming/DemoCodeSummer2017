/** Class to demonstrate how to create an array of  demonstrate using an array 
  * of objects (books)
  * @author pwaite       
  */

public class ObjectArrayDemo {
    /** 1. instantiate an array of books
     *  2. create book objects
     *  3. put the book objects in the array
     *  4. display the books from the array
     *  @param args the command line arguments
     */
     public static void main(String[] args) {
        // 1. instantiate an array of books
        Book[] myBooks = new Book[3];
        
        //2. create book objects
        Book book1 = new Book();
        book1.setTitle("Head First Java");
        
        Book book2 = new Book();
        book2.setTitle("Once We Were Brothers");
        
        Book book3 = new Book();
        book3.setTitle("Winnie the Pooh");
        
        //3. put the book objects in the array
        myBooks[0] = book1;
        myBooks[1] = book2;
        myBooks[2] = book3;
        
        //4. display the books from the array
        int counter = 0;
        while (counter < myBooks.length) {
            //myBooks[counter] is like myBooks[0] which is 
            // a variable pointing to a book object
            // so I can use dot notation to access instance variables
            // and methods on that object
            // myBooks[0].title
            myBooks[counter].display();
            counter++;
        }
            
     }
}
