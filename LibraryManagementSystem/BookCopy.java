package LibraryManagementSystem;

public class BookCopy {
    private Book book;
    private int id;
    private boolean available;

    public BookCopy(Book book,int id,boolean available){
        this.book=book;
        this.id=id;
        this.available=available;
    }

    public Book getBook() {
        return book;
    }

    public int getId() {
        return id;
    }
    public boolean getAvailable(){
        return available;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
