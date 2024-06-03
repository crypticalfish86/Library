/**
 * File-name: BookUnitTest.java
 * Version: 1.0
 * Creation date: 06.03.24
 * Last modification date: 10.03.24
 * Author: Jace Weerawardena
 * Purpose of the program: Tests the Book class
 */
public class BookUnitTest
{
    public static void main(String[] args)
    {
        testConstructorAndGetters();
        testSetters();
        testBookID();
        testToString();
        testNonFiction();
        testMultipleAuthorsNonFiction();
    }

    /**
     * Testing the constructor of the Book class and ability to call field values using the accessors
     */
    public static void testConstructorAndGetters()
    {
        Book testBook = new Book("Weerawardena", "Jace", "Biography", Genre.ROMANCE);
        String expected = String.format("EXPECTED:\nTITLE: %s\nWRITTEN BY: %s%s\nGENRE: %s\nBOOK_ID: %d\n", "Biography", "Jace","Weerawardena", Genre.ROMANCE, 1004825);
        String actual = String.format("ACTUAL:\nTITLE: %s\nWRITTEN BY: %s%s\nGENRE: %s\nBOOK_ID: %d\n", testBook.getTitle(), testBook.getAuthorRestOfName(), testBook.getAuthorFamilyNames(), testBook.getGenre(), testBook.getBookID());
        System.out.println("TEST 1: testConstructorAndGetters\n");
        System.out.println(expected);
        System.out.println(actual);
        System.out.println("\n\n");
    }

    /**
     * testing the ability to set various fields in the Book class
     */
    public static void testSetters()
    {
        Book testBook = new Book("null", "null", "null", Genre.FANTASY);
        testBook.setAuthorFamilyNames("Weerawardena");
        testBook.setAuthorRestOfName("Jace");
        testBook.setTitle("Biography");
        testBook.setGenre(Genre.ROMANCE);
        String expected = String.format("EXPECTED:\nTITLE: %s\nWRITTEN BY: %s%s\nGENRE: %s\nBOOK_ID: %d\n", "Biography", "Jace","Weerawardena", Genre.ROMANCE, 1004826);
        System.out.println("TEST 2: testSetters\n");
        System.out.println(expected);
        System.out.println("ACTUAL:\n" + testBook + "\n\n");
    }

    /**
     * Testing the ability for the Book class to incrementally assign bookID values
     */
    public static void testBookID()
    {
        Book testBook1 = new Book("Weerawardena", "Jace", "Biography", Genre.ROMANCE);
        Book testBook2 = new Book("Weerawardena", "Jace", "Biography", Genre.ROMANCE);
        Book testBook3 = new Book("Weerawardena", "Jace", "Biography", Genre.ROMANCE);
        System.out.println("TEST 3: testBookID\n");
        String expected = String.format("EXPECTED:\nFirst bookID: %d\nSecond bookID: %d\nThird bookID: %d\n", 1004827, 1004828, 1004829);
        String actual = String.format("ACTUAL:\nFirst bookID: %d\nSecond bookID: %d\nThird bookID: %d\n", testBook1.getBookID(), testBook2.getBookID(), testBook3.getBookID());
        System.out.println(expected);
        System.out.println(actual);
        System.out.println("\n\n");
    }

    /**
     * Testing the Book classes ability to present itself as a string when called
     */
    public static void testToString()
    {
        Book testBook = new Book("Weerawardena", "Jace", "Biography", Genre.ROMANCE);
        String expected = String.format("EXPECTED:\nTITLE: %s\nWRITTEN BY: %s%s\nGENRE: %s\nBOOK_ID: %d\n", "Biography", "Jace","Weerawardena", Genre.ROMANCE, 1004830);
        System.out.println("TEST 4: testToString\n");
        System.out.println(expected);
        System.out.println("ACTUAL:\n" + testBook + "\n\n");
    }

    /**
     * Testing the Book classes ability to create a citation
     */
    public static void testNonFiction()
    {
        Book testBook = new Book("Weerawardena", "Jace", "Biography", Genre.NON_FICTION, 2024, "Me", 100);
        System.out.println("TEST 5: testNonFiction");
        System.out.println("EXPECTED:\n" + "Weerawardena, Jace. Biography. Me (2024) 100pp.\n");
        System.out.println("ACTUAL:\n" + testBook.getCitation() + "\n\n");
    }
    /**
     * Testing the Book classes ability to create a citation with multiple authors
     */
    public static void testMultipleAuthorsNonFiction()
    {
        String[] authorArray = {"Weerawardena", "Jace", "Zix", "Felix", "Krips", "Zac"};
        Book testBook = new Book(authorArray, "Biography", Genre.NON_FICTION, 2024, "Me", 100);
        System.out.println("TEST 6: testMultipleAuthorsNonFiction\n");
        System.out.println("EXPECTED:\n" + "Weerawardena, Jace and Zix, Felix and Krips, Zac. Biography. Me (2024) 100pp.\n");
        System.out.println("Actual:");
        System.out.println(testBook.getCitation());
    }
}
