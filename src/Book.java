/**
 * File-name: Book.java
 * Version: 1.0
 * Creation date: 05.03.24
 * Last modification date: 10.03.24
 * Author: Jace Weerawardena
 * Purpose of the program: Models a class representing a book for a library
 */
public class Book
{
    private static int bookIDAssignmentValue = 1004825; /*Value to assign serial number (Increments after assignment)*/
    private String authorFamilyNames; /*Last name of author*/
    private String authorRestOfName; /*First + middle names of author*/
    private final int bookID; /*Serial number for book*/
    private Genre genre; /*Genre for the book*/
    private String[] multipleAuthorNames; /*List of authors if multiple for book*/
    private int numPages; /*Number of pages in a book*/
    private String publisher; /*Publisher of the book*/
    private String title; /*Title of the book*/
    private int year; /*Year book was published*/


    /**
     * First Book constructor which initialises basic values for a Book object
     * @param FamilyNames
     * The family name of the author of the book
     * @param RestOfName
     * Any additional name(s) the author of the book has
     * @param title
     * The book title
     * @param genre
     * The genre of the book
     */
    public Book(String FamilyNames, String RestOfName, String title, Genre genre)
    {
        setAuthorFamilyNames(FamilyNames);
        setAuthorRestOfName(RestOfName);
        this.multipleAuthorNames = null;
        setTitle(title);
        this.bookID = bookIDAssignmentValue;
        bookIDAssignmentValue++;
        setGenre(genre);
    }

    /**
     * Second Book constructor which initialises values for a Book object including year, publisher and numPages
     * @param FamilyName
     * The family name of the author of the book
     * @param RestOfName
     * Any additional name(s) the author of the book has
     * @param title
     * The book title
     * @param genre
     * The genre of the book
     * @param year
     * The year the book was published
     * @param publisher
     * The name of the publisher
     * @param pages
     * The number of pages the book has
     */
    public Book(String FamilyName, String RestOfName, String title, Genre genre, int year, String publisher, int pages)
    {
        setAuthorFamilyNames(FamilyName);
        setAuthorRestOfName(RestOfName);
        this.multipleAuthorNames = null;
        setTitle(title);
        this.bookID = bookIDAssignmentValue;
        bookIDAssignmentValue++;
        setGenre(genre);
        setYear(year);
        setPublisher(publisher);
        setNumPages(pages);
    }

    /**
     * Third Book constructor used in the event that there are multiple authors for a single book
     * @param multipleAuthorNames
     * An array containing all the authors of the book structured:
     * {"family name", "other name(s)", "family name", "other name(s)"}
     * @param title
     * The book title
     * @param genre
     * The genre of the book
     * @param year
     * The year the book was published
     * @param publisher
     * The name of the publisher
     * @param pages
     * The number of pages the book has
     */
    public Book(String[] multipleAuthorNames, String title, Genre genre,int year, String publisher, int pages)
    {
        setMultipleAuthorNames(multipleAuthorNames);
        setTitle(title);
        this.bookID = bookIDAssignmentValue;
        bookIDAssignmentValue++;
        setGenre(genre);
        setYear(year);
        setPublisher(publisher);
        setNumPages(pages);
    }

    /**
     * Mutator for authorFamilyNames
     * @param authorFamilyNames
     * The family name of the author of the book
     */
    public void setAuthorFamilyNames(String authorFamilyNames)
    {
        this.authorFamilyNames = authorFamilyNames;
    }

    /**
     * Mutator for authorRestOfName
     * @param authorRestOfName
     * Any additional name(s) the author of the book has
     */
    public void setAuthorRestOfName(String authorRestOfName)
    {
        this.authorRestOfName = authorRestOfName;
    }

    /**
     * Mutator for multipleAuthorNames
     * @param multipleAuthorNames
     * An array containing all the authors of the book structured:
     * {"family name", "other name(s)", "family name", "other name(s)"}
     */
    public void setMultipleAuthorNames(String[] multipleAuthorNames)
    {
        this.multipleAuthorNames = new String[multipleAuthorNames.length];

        /*Loop adds all authors to the classes array of author names*/
        for (int i = 0; i < this.multipleAuthorNames.length; i++)
        {
            this.multipleAuthorNames[i] = multipleAuthorNames[i];
        }
    }

    /**
     * Mutator for title
     * @param title
     * The book title
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * Mutator for genre
     * @param genre
     * The genre of the book
     */
    public void setGenre(Genre genre)
    {
        this.genre = genre;
    }

    /**
     * Mutator for year
     * @param year
     * The year the book was published
     */
    public void setYear(int year)
    {
        this.year = year;
    }

    /**
     * Mutator for publisher
     * @param publisher
     * The name of the publisher
     */
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    /**
     * Mutator for numPages
     * @param numPages
     * The number of pages the book has
     */
    public void setNumPages(int numPages)
    {
        this.numPages = numPages;
    }

    /**
     * Accessor for authorFamilyNames
     * @return
     * The family name of the author of the book
     */
    public String getAuthorFamilyNames()
    {
        return authorFamilyNames;
    }

    /**
     * Accessor for authorRestOfName
     * @return
     * Any additional name(s) the author of the book has
     */
    public String getAuthorRestOfName()
    {
        return authorRestOfName;
    }

    /**
     * Accessor for multipleAuthorNames
     * @return
     * An array containing all the authors of the book structured:
     * {"family name", "other name(s)", "family name", "other name(s)"}
     */
    public String[] getMultipleAuthorNames()
    {
        return multipleAuthorNames;
    }

    /**
     * Accessor for title
     * @return
     * The book title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Accessor for bookID
     * @return
     * The serial number for this book
     */
    public int getBookID()
    {
        return bookID;
    }

    /**
     * Accessor for genre
     * @return
     * The genre of the book
     */
    public Genre getGenre()
    {
        return genre;
    }

    /**
     * Accessor for year
     * @return
     * The year the book was published
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Accessor for publisher
     * @return
     * The name of the publisher
     */
    public String getPublisher()
    {
        return publisher;
    }

    /**
     * Accessor for numPages
     * @return
     * The number of pages the book has
     */
    public int getNumPages()
    {
        return numPages;
    }

    /**
     * Overrides the toString method to give more detailed information about the book
     * @return
     * A string containing information about the title, author name, book genre and id of the book
     */
    @Override
    public String toString()
    {
        return String.format
                (
                    "TITLE: %s\nWRITTEN BY: %s%s\nGENRE: %s\nBOOK_ID: %d",
                    title,
                    authorRestOfName,
                    authorFamilyNames,
                    genre,
                    bookID
                );
    }

    /**
     * Allows a simplified string containing basic information about a book to be printed out, if there are
     * multiple authors, string contains the name of the first author, plus "et al." signifying more authors.
     * @return
     * A string containing information about the title and name of the author(s)
     */
    public String getShortString()
    {
        if (this.multipleAuthorNames != null) /*Uses this format if there are multiple authors of the book*/
        {
            return String.format("%s%set al.%s", multipleAuthorNames[1], multipleAuthorNames[0], title);
        }
        else /*Uses this format otherwise, if there is just one author*/
        {
            return String.format("%s%s%s", authorFamilyNames, authorRestOfName, title);
        }
    }

    /**
     * Creates a citation for the book, the detail of the citation varying
     * based on whether the book is fiction or non-fiction
     * @return
     * The citation for the book
     */
    public String getCitation()
    {
        if (this.genre == Genre.NON_FICTION) /*Creates a non-fiction citation if book is non-fiction*/
        {
            return nonFictionCitation();
        }
        else /*Otherwise creates a fiction citation*/
        {
            return fictionCitation();
        }
    }

    /**
     * Generates a non-fiction citation of the book on this shelf
     * @return
     * A citation in the form: "author name(s). title. publisher (year) pages"
     */
    private String nonFictionCitation()
    {
        if (multipleAuthorNames != null)/*Append multiple names onto the citation if there are multiple authors*/
        {
            String nonFictionString = ""; /*Creates a string to append citation to*/
            nonFictionString += appendMultipleAuthorNames();
            nonFictionString += String.format("%s. %s (%d) %dpp.", title, publisher, year, numPages);
            return nonFictionString;
        }
        else /*Otherwise when there is one author just create the citation using a simpler format*/
        {
            return String.format
                    (
                            "%s, %s. %s. %s (%d) %dpp.",
                            authorFamilyNames,
                            authorRestOfName,
                            title,
                            publisher,
                            year,
                            numPages
                    );
        }
    }

    /**
     * Generates a fiction citation of the book on this shelf
     * @return
     * A citation in the form: "author name(s). title."
     */
    private String fictionCitation()
    {
        if (multipleAuthorNames != null)/*Append multiple names onto the citation if there are multiple authors*/
        {
            String fictionString = "";
            fictionString += appendMultipleAuthorNames();
            fictionString += String.format("%s.", this.title);
            return fictionString;
        }
        else /*Otherwise when there is one author just create the citation using a simpler format*/
        {
            return String.format("%s, %s. %s.", this.authorFamilyNames, this.authorRestOfName, this.title);
        }
    }

    /**
     * Builds a string of all authors of a book for use in generating a citation
     * @return
     * The first half of a citation containing all authors of the book
     */
    private String appendMultipleAuthorNames()
    {
        /*
            Loop appends all but the last family and first name of the multipleAuthorNames array to the fiction
            string (special format for last author)
         */
        String authorString = "";
        for (int i = 0; i < multipleAuthorNames.length - 2; i += 2)
        {
            authorString += (multipleAuthorNames[i] + ", " + multipleAuthorNames[i + 1]) + " and ";
        }
        authorString += multipleAuthorNames[multipleAuthorNames.length - 2] + ", ";
        authorString += multipleAuthorNames[multipleAuthorNames.length - 1] + ". ";
        return authorString;
    }
}
