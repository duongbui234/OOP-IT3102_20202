package hust.soict.aims.media;

public class DigitalVideoDisc extends Media {

	private String director;

	private int length;

	/**
	 * Constructor for DigitalVideoDisc
	 */
	public DigitalVideoDisc() {
		super();
	}


	public String getDirector() {
		return director;
	}

	/**
	 * @param director
	 *            The director to set.
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return Returns the length.
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length
	 *            The length to set.
	 */
	public void setLength(int length) {
		this.length = length;
	}
}