package CLasses;

import Interface.IBulding;
import Interface.IDestroy;

import java.time.LocalDate;

public class Crane extends Vehicles implements IBulding, IDestroy {

    private int maxHeight;
    private int maxWeightToUp;
    protected int weightToUp;

    public Crane() {
    }

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
    public String toString() {
        return "Crane{" +
                "maxHeight=" + maxHeight +
                ", maxWeightToUp=" + maxWeightToUp +
                ", weightToUp=" + weightToUp +
                ", vehicleName='" + vehicleName + '\'' +
                ", purchaseYear=" + purchaseYear +
                ", warranty=" + warranty +
                "} " + super.toString();
    }

    @Override
    public void moveToService() {
        if (purchaseYear < LocalDate.EPOCH.getYear()) {
            System.out.println("To service!");
        } else {
            System.out.println("Warranty is over!");
        }
    }

    @Override
    public void build() {
        if (weightToUp<maxWeightToUp) {
            System.out.println("Building...");
        }
    }

    @Override
    public void detroy() {
        System.out.println(getVehicleName()+" cannot destroy it! ");
    }
}
