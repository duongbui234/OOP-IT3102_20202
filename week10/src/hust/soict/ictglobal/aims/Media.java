package hust.soict.ictglobal.aims;

import java.util.Objects;

public class Media {
	private String title;

	private String category;

	private float cost;

	/**
	 *  
	 */
	public Media() {
		super();
	}

	/**
	 * Returns the category.
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Returns the cost.
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * Returns the title.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the category.
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Sets the cost.
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}

	/**
	 * Sets the title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Media media = (Media) o;
		return Float.compare(media.cost, cost) == 0 &&
				Objects.equals(title, media.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, cost);
	}
}