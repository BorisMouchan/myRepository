package CLasses;

import java.time.LocalDate;
import java.util.Objects;

public class Bulldozer extends Vehicles {

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

    public Bulldozer(String vehicleName, int purchaseYear, boolean warranty, int maxSpeed, int maxWeight) {
        super(vehicleName, purchaseYear, warranty);
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Bulldozer{" +
                "maxSpeed=" + maxSpeed +
                ", maxWeight=" + maxWeight +
                ", vehicleName='" + vehicleName + '\'' +
                ", purchaseYear=" + purchaseYear +
                ", warranty=" + warranty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bulldozer bulldozer = (Bulldozer) o;
        return purchaseYear == bulldozer.purchaseYear && warranty == bulldozer.warranty && maxSpeed == bulldozer.maxSpeed && maxWeight == bulldozer.maxWeight && Objects.equals(vehicleName, bulldozer.vehicleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleName, purchaseYear, warranty, maxSpeed, maxWeight);
    }

    @Override
    public void moveToService() {
        if (purchaseYear < LocalDate.EPOCH.getYear()) {
            System.out.println("To service!");
        } else {
            System.out.println("Warranty is over!");
        }
    }
}

