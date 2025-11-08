package LibraryManagementSystem;

import java.util.Objects;

public class Book implements IBook{
    private String title;
    //we want one of these to be unique maybe title
    private String author;
    private int cost;

    public Book(String title,String author, int cost){
        this.title=title;
        this.author=author;
        this.cost=cost;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,author);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null || this.getClass()!=obj.getClass()){
            return false;
        }
        return Objects.equals(title,((Book) obj).title) && Objects.equals(author,((Book) obj).author);
    }

    public String displayBook(){
        return this.title+" "+this.author+" "+this.cost;
    }
}
