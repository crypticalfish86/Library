/**
 * File-name: Shelf.java
 * Version: 1.0
 * Creation date: 07.03.24
 * Last modification date: 10.03.24
 * Author: Jace Weerawardena
 * Purpose of the program: Models a shelf to store books on for a library
 */
public class Shelf
{
    private ShelfSpace leftEnd; /*Reference to the shelf-space at the far left end of the shelf*/
    private ShelfSpace rightEnd; /*Reference to the shelf-space at the far right end of the shelf*/

    /**
     * Constructor to initialise a shelf, a shelf starts off completely empty
     */
    public Shelf()
    {
        this.leftEnd = null;
        this.rightEnd = null;
    }

    /**
     * Adds books to the shelf from right to left
     * @param book
     * The book to be added to the leftmost shelf space on the shelf
     */
    public void addLeft(Book book)
    {
        if (this.rightEnd == null) /*Adding a book to an empty shelf makes both ends of the shelf point to the same book*/
        {
            this.rightEnd = new ShelfSpace(book);
            this.leftEnd = this.rightEnd;
        }
        else /*Otherwise a non-empty shelf adds books onto the left side of the shelf*/
        {
            ShelfSpace newShelfSpace = new ShelfSpace(book);
            this.leftEnd.setLeftSpace(newShelfSpace);
            this.leftEnd.getLeftSpace().setRightSpace(this.leftEnd);
            this.leftEnd = newShelfSpace;
        }
    }

    /**
     * Takes the rightmost book off of the shelf, returns it then removes that book from the shelf.
     * @return
     * The book taken off the shelf (if there is a book on the shelf)
     */
    public Book takeRight()
    {
        if(this.leftEnd == null) /*Trying to take a book from an empty shelf returns no books*/
        {
            return null;
        }
        else if (this.leftEnd == this.rightEnd) /*Taking a book from a shelf with one book empties the shelf*/
        {
           Book bookToBeRemoved = this.rightEnd.getBook();
           this.rightEnd = null;
           this.leftEnd = null;
           return bookToBeRemoved;
        }
        else /*Otherwise removes book from shelf and updates the right end of the shelf*/
        {
            Book bookToBeRemoved = this.rightEnd.getBook();
            this.rightEnd = this.rightEnd.getLeftSpace();
            this.rightEnd.setRightSpace(null);
            return bookToBeRemoved;
        }
    }

    /**
     * Empties the shelf from right to left printing out each book being removed as it empties.
     */
    public void empty()
    {
        /*while the leftmost bookshelf isn't empty will continually remove books while printing them out*/
        while (this.leftEnd != null)
        {
            if (this.leftEnd == this.rightEnd) /*Taking a book from a shelf with one book empties the shelf*/
            {
                System.out.println(this.rightEnd);
                this.leftEnd = null;
                this.rightEnd = null;
            }/*Otherwise removes book from shelf and updates the right end of the shelf*/
            else
            {
                System.out.println(this.rightEnd);
                this.rightEnd = this.rightEnd.getLeftSpace();
                this.rightEnd.setRightSpace(null);
            }
        }
    }

    /**
     * creates a brief description of all the books on the shelf, unless shelf is empty in which case states shelf is empty
     * @return
     * The string containing the brief description of all books on the shelf
     */
    public String printAll()
    {
        String returningString = "";
        if (this.rightEnd == null) /*If the shelf starts empty there are no books to be removed and user is informed*/
        {
            returningString += "empty";
        }
        else /*Otherwise invokes a function that appends a description of all books to the returning string*/
        {
            returningString += printBook(this.leftEnd);
        }
        return returningString;
    }

    /**
     * Recursively concatenates a string, creating a description of all books on
     * a shelf from currenShelfSpace to the end of the shelf
     * @param currentShelfSpace
     * The starting shelf-space
     * @return
     * A string containing a brief description of all books on the shelf
     */
    private String printBook(ShelfSpace currentShelfSpace)
    {
        if (currentShelfSpace == this.rightEnd) /*Base case: When function reaches the rightmost book on the shelf*/
        {
            return  currentShelfSpace.toString();
        }
        else /*Recursive case: the currentShelfSpace concatenated onto the shelfSpace directly to the right*/
        {
            return currentShelfSpace.toString() + "\n" + printBook(currentShelfSpace.getRightSpace());
        }
    }
}
