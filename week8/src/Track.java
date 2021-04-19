public class Track implements Playable, Comparable{
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track Length: " + this.getLength());
    }

    @Override
    public int compareTo(Object o) {
        Track tmp = (Track)o;

        if(tmp.getTitle().equals(this.getTitle()) && tmp.getLength() == this.getLength())
            return 1;
        return 0;
    }
}
