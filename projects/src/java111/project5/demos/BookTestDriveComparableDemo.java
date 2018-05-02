package java111.project5.demos;

import java.util.Set;
import java.util.TreeSet;

public class BookTestDriveComparableDemo {
    public static void main(String[] args) {
        Set<Comparable> ebookSet = new TreeSet<Comparable>();
        EBook eBook = new EBook(876876, "paulawaite.com/book/mybook", 12345);
        EBook eBook2 = new EBook(9879872, "paulawaite.com/book/mybook2", 12535353);
        ebookSet.add(eBook);
        ebookSet.add(eBook2);

        System.out.println(ebookSet);


    }
}
