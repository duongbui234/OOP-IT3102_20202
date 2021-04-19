import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book extends Media implements Comparable {

    private List<String> authors = new ArrayList <String>();
    private String content;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        Book tmp = (Book)o;
        if(tmp.getTitle().equals(this.getTitle()))
            return 1;

        return 0;
    }

    public void processContent(){
        List<String> contentTokens = new ArrayList<String>();
        Map<String, Integer> wordFrequency = new HashMap<>();
        this.contentTokens = this.getContent().split(" ");

    }


}
