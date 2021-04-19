package hust.soict.aims.media;

import java.util.ArrayList;

public class Order {

	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	public void addMedia(Media item){
		if(! itemsOrdered.contains(item)){
			itemsOrdered.add(item);
		}
	}

	public void removeMedia(Media item){
		if(itemsOrdered.contains(item)){
			itemsOrdered.remove(item);
		}
	}

	public float totalCost(){
		float total = 0;
		Media mediaItem;
		java.util.Iterator iter = itemsOrdered.iterator();

		while(iter.hasNext()){
			mediaItem = (Media) (iter.next());
			total += mediaItem.getCost();
		}

		return total;
	}

	public Order() {
		super();
	}


}