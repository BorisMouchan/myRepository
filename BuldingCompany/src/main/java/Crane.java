public class Crane extends Machine{

    private int maxHeight;
    private int maxWeightToUp;

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getMaxWeightToUp() {
        return maxWeightToUp;
    }

    public void setMaxWeightToUp(int maxWeightToUp) {
        this.maxWeightToUp = maxWeightToUp;
    }

    public Crane(String manufacterName, int purchaseYear, int warranty, int maxHeight, int maxWeightToUp) {
        super(manufacterName, purchaseYear, warranty);
        this.maxHeight = maxHeight;
        this.maxWeightToUp = maxWeightToUp;
    }

}
