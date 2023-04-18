public class Bulldozer extends Machine{

    public int maxSpeed;
    public int maxWeight;

    public Bulldozer(String manufacterName, int purchaseYear, int warranty, int maxSpeed, int maxWeight) {
        super(manufacterName, purchaseYear, warranty);
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }



    }
