package java111.project5.demos;

/** The loanable interface - used for any
 *  item that could be loaned out
 *  @author pwaite
 */

public interface Loanable {
    /** specifies the period of time the item
     *  can be loaned out
     *  @return loan period
     */
    public abstract int determineLoanPeriod();
}

