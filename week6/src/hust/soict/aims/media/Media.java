package hust.soict.aims.media;

public class Media {
    private String title;
    private String category;
    private float cost;

    public Media(String title){
        this.title = title
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public static void main(String[] args){

    }
}
