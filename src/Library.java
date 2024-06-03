/**
 * File-name: Library.java
 * Version: 1.0
 * Creation date: 08.03.24
 * Last modification date: 10.03.24
 * Author: Jace Weerawardena
 * Purpose of the program: Models a library full of books of different genres
 */
import java.util.ArrayList;
public class Library
{
    private Shelf incoming; /*The shelf the library will be processing*/
    private ArrayList<Book> crime; /*The libraries crime section*/
    private ArrayList<Book> fantasy; /*The libraries fantasy section*/
    private ArrayList<Book> nonFiction; /*The libraries non-fiction section*/
    private ArrayList<Book> romance; /*The libraries romance section*/
    private ArrayList<Book> sciFi; /*The libraries science-fiction section*/

    /**
     * Constructor for library class, initialises array lists of each genre and the
     * incoming shelf to be processed
     * @param incoming
     * The incoming shelf to be searched/processed
     */
    public Library(Shelf incoming)
    {
        setIncoming(incoming);
        this.crime = new ArrayList<Book>();
        this.fantasy = new ArrayList<Book>();
        this.nonFiction = new ArrayList<Book>();
        this.romance = new ArrayList<Book>();
        this.sciFi = new ArrayList<Book>();
    }

    /**
     * Mutator which changes the incoming bookshelf
     * @param incoming
     * The Shelf that the library class searches/processes
     */
    public void setIncoming(Shelf incoming)
    {
        this.incoming = incoming;
    }

    /**
     * Accessor which changes the incoming bookshelf
     * @return
     * The Shelf that the library class searches/processes
     */
    public Shelf getIncoming()
    {
        return incoming;
    }

    /**
     * Accessor for the crime section of the library
     * @return
     * Array list containing the crime section of the library
     */
    public ArrayList<Book> getCrime()
    {
        return crime;
    }

    /**
     * Accessor for the fantasy section of the library
     * @return
     * Array list containing the crime section of the library
     */
    public ArrayList<Book> getFantasy()
    {
        return fantasy;
    }

    /**
     * Accessor for the non-fiction section of the library
     * @return
     * Array list containing the non-fiction section of the library
     */
    public ArrayList<Book> getNonFiction()
    {
        return nonFiction;
    }

    /**
     * Accessor for the romance section of the library
     * @return
     * Array list containing the non-fiction section of the library
     */
    public ArrayList<Book> getRomance()
    {
        return romance;
    }

    /**
     * Accessor for the science fiction section of the library
     * @return
     * Array list containing the science fiction section of the library
     */
    public ArrayList<Book> getSciFi()
    {
        return sciFi;
    }

    /**
     * "processes" the books on the incoming shelf from right to left by emptying the shelf and storing the
     * books in the 5 array lists sorted by the books genre.
     */
    public void process()
    {
        Book bookToBeProcessed = this.incoming.takeRight();

        /*Continually removes books so long as shelf isn't empty*/
        while (bookToBeProcessed != null)
        {
            switch (bookToBeProcessed.getGenre()) /*Sorts book into correct array by genre*/
            {
                case CRIME:
                    this.crime.add(bookToBeProcessed);
                    break;
                case FANTASY:
                    this.fantasy.add(bookToBeProcessed);
                    break;
                case NON_FICTION:
                    this.nonFiction.add(bookToBeProcessed);
                    break;
                case ROMANCE:
                    this.romance.add(bookToBeProcessed);
                    break;
                case SCIENCE_FICTION:
                    this.sciFi.add(bookToBeProcessed);
                    break;
            }
            bookToBeProcessed = this.incoming.takeRight();
        }
    }

    /**
     *Takes a full or partial title of a book as well as it's genre and prints all books in that genre
     * whose title matches the one given.
     * @param bookGenre
     * The genre of the book you're searching for
     * @param partialOrFullTitle
     * A string which is either the full title of the book you're searching for or a partial one
     */
    public void search(Genre bookGenre, String partialOrFullTitle)
    {
        switch (bookGenre) /*Selects an array to search by genre of book*/
        {
            case CRIME:
                searchAndPrintFromArrayList(this.crime, partialOrFullTitle);
                break;
            case FANTASY:
                searchAndPrintFromArrayList(this.fantasy, partialOrFullTitle);
                break;
            case NON_FICTION:
                searchAndPrintFromArrayList(this.nonFiction, partialOrFullTitle);
                break;
            case ROMANCE:
                searchAndPrintFromArrayList(this.romance, partialOrFullTitle);
                break;
            case SCIENCE_FICTION:
                searchAndPrintFromArrayList(this.sciFi, partialOrFullTitle);
                break;
        }
    }

    /**
     * Prints all books in the array list that have the substring in their title given to the function.
     * If no book is found that matches the substring will print "No results found."
     * @param list
     * The array list the function will search in
     * @param partialOrFullTitle
     * A string which is either the full title of the book you're searching for or a partial one
     */
    private void searchAndPrintFromArrayList(ArrayList<Book> list, String partialOrFullTitle)
    {
        boolean foundBook = false;

        /*Checks every book in the list and prints all books with similar/same titles*/
        for (Book book: list)
        {
            if (book.getTitle().toUpperCase().contains(partialOrFullTitle.toUpperCase())) /*prints if title matches*/
            {
                foundBook = true;
                System.out.println(book.getCitation());
            }
        }

        if (!foundBook) /*If no books found, will inform user*/
        {
            System.out.println("No results found.");
        }
    }
}
