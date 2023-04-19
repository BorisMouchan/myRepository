package CLasses;

public class Crane extends Vehicles {

    private int maxHeight;
    private int maxWeightToUp;

    public Crane(String vehicleName, int purchaseYear, boolean warranty, int maxHeight, int maxWeightToUp) {
        super(vehicleName, purchaseYear, warranty);
        this.maxHeight = maxHeight;
        this.maxWeightToUp = maxWeightToUp;
    }

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


    @Override
    void moveToService() {

    }
}
