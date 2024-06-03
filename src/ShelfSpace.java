/**
 * File-name: ShelfSpace.java
 * Version: 1.0
 * Creation date: 07.03.24
 * Last modification date: 10.03.24
 * Author: Jace Weerawardena
 * Purpose of the program: Models a space on a shelf to store books
 */
public class ShelfSpace
{
    private Book book; /*Reference to the book stored at this shelf-space*/
    private ShelfSpace leftSpace; /*Reference to the shelf-space directly left of this space*/
    private ShelfSpace rightSpace;/*Reference to the shelf-space directly right of this space*/

    /**
     * Constructor for the ShelfSpace class, initialises with a book and empty references to spaces next to it
     * @param book
     * Book stored at this shelf-space
     */
    public ShelfSpace(Book book)
    {
        setBook(book);
    }

    /**
     * Stores a book in this shelf-space
     * @param book
     * The stored book
     */
    public void setBook(Book book)
    {
        this.book = book;
    }

    /**
     * Sets a reference to the shelf space directly to the left of this space
     * @param leftSpace
     * The space to the left of this space
     */
    public void setLeftSpace(ShelfSpace leftSpace)
    {
        this.leftSpace = leftSpace;
    }

    /**
     * Sets a reference to the shelf space directly to the right of this space
     * @param rightSpace
     * The space to the right of this space
     */
    public void setRightSpace(ShelfSpace rightSpace)
    {
        this.rightSpace = rightSpace;
    }

    /**
     * Retrieves the book stored at this shelf spaces
     * @return
     * the book stored at this shelf spaces
     */
    public Book getBook()
    {
        return book;
    }

    /**
     * Retrieves the shelf space directly to the left of this space
     * @return
     * The space to the left of this space
     */
    public ShelfSpace getLeftSpace()
    {
        return leftSpace;
    }

    /**
     * Retrieves the shelf space directly to the right of this space
     * @return
     * The space to the right of this space
     */
    public ShelfSpace getRightSpace()
    {
        return rightSpace;
    }

    /**
     * Retrieves a brief description of the book stored at this shelf space
     * @return
     * The description of the book stored at this shelf space
     */
    public String toString()
    {
        return this.book.getShortString();
    }
}
