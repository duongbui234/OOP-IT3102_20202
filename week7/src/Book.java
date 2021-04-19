import java.util.ArrayList;
import java.util.List;

public class Book extends Media implements Comparable {

    private List<String> authors = new ArrayList <String>();

    public List<String> getAuthors() {
        return authors;
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Book(){}

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName){
        if(! authors.contains(authorName)){
            authors.add(authorName);
        }
    }

    public void remove(String authorName){
        if (authors.contains(authorName)){
            authors.remove(authorName);
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
