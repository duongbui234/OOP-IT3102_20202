package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

    private List<String> authors = new ArrayList <String>();

    public Book(){

    }

    public List<String> getAuthors() {
        return authors;
    }

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

}
