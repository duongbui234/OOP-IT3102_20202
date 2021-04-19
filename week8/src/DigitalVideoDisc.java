public class DigitalVideoDisc extends Disc implements Playable, Comparable {

	private String director;

	private int length;

	public DigitalVideoDisc() {
		super();
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	@Override
	public int compareTo(Object o) {
		DigitalVideoDisc tmp = (DigitalVideoDisc)o;
		return Integer.compare(this.getTitle().length(),tmp.getTitle().length());	}
}