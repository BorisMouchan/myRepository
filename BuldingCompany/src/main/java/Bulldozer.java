public class Bulldozer extends Vehicles{

    private int maxSpeed;
    private int maxWeight;


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Bulldozer(String manufacterName, int purchaseYear, boolean warranty, int maxSpeed, int maxWeight) {
        super(manufacterName, purchaseYear, warranty);
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }



    }
