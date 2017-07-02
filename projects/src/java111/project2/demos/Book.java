/** A class representing book
  *  to demonstrate our first class
  * @author pwaite
  */

public class Book {

    private String title;
    private String author;
    private int numberOfPages;
    
    /** method to return the book's title
     *  @return the book's title
     */
     
    public String getTitle() {
        return title;
    }
    
    /** method to set the book's title
     *  @param the book's title
     */
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    
    /** returns the book's author
     *  @return the book's author
     */
     public String getAuthor() {
         return author;
     }
     
     /** sets the book's author
      *  @param newAuthor the book's author
      */
     public void setAuthor(String newAuthor) {
         author = newAuthor;
     }
     
     /** returns the book's numberOfPages
     *  @return the book's numberOfPages
     */
     public int getNumberOfPages() {
         return numberOfPages;
     }
     
     /** sets the book's numberOfPages
      *  @param newNumberOfPages the books numberOfPages
      */
     public void setNumberOfPages(int newNumberOfPages) {
         numberOfPages = newNumberOfPages;
     }

    
    /** method to display book information
     */
    public void display() {
        System.out.println("The book info:");
        System.out.println("Title: " + title);
        System.out.println("Author(s): " + author);
        System.out.println("Pages: " + numberOfPages);
        System.out.println();
        
    }
}
