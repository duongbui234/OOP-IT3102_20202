import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable, Comparable{
    private String artist;
    private int length;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTrack(Track track){
        if(! tracks.contains(track)){
            tracks.add(track);
        }
    }

    public void removeTrack(Track track){
        if(tracks.contains(track)){
            tracks.remove(track);
        }
    }

    public int getLength(){
        int total_length = 0;
        Track trackItem;
        java.util.Iterator iter = tracks.iterator();

        while(iter.hasNext()){
            trackItem = (Track) (iter.next());
            total_length += trackItem.getLength();
        }

        return total_length;
    }

    @Override
    public void play() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}



