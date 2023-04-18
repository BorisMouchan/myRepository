public class Crane extends Machine{
    public int maxHeight;
    public int maxWeightToUp;

    public Crane(String manufacterName, int purchaseYear, int warranty, int maxHeight, int maxWeightToUp) {
        super(manufacterName, purchaseYear, warranty);
        this.maxHeight = maxHeight;
        this.maxWeightToUp = maxWeightToUp;
    }

}
