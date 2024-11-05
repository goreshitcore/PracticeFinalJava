public class Book extends Media {

    private int numberOfPages;

    public int getNumberOfPages()  {
        return numberOfPages;
    }

    public Book(String title, int numberOfPages) {
        super(title);
        this.numberOfPages = numberOfPages;
    }

    

    public String toString() {
        return "title = " + getTitle() + "\nnumberOfPages = " + numberOfPages; 
    }

    
}
