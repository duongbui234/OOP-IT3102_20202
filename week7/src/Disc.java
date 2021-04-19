public class Disc extends Media {
    private int length;
    private String director;

//    public Disc(String title) {
//        super(title);
//    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
