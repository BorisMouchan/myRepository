package CLasses;

import Exceptions.NegativePurchaseYear;

import java.util.Objects;
import java.util.logging.Logger;

public abstract class Vehicles {

    protected String vehicleName;
    protected int purchaseYear;
    protected boolean warranty;
    private final int WEATHER_TO_CHANGE_TIRES = 4;

    public Vehicles() {
    }

    public Vehicles(String vehicleName, int purchaseYear, boolean warranty) {
        this.vehicleName = vehicleName;
        this.purchaseYear = purchaseYear;
        this.warranty = warranty;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public void setPurchaseYear(int purchaseYear) throws NegativePurchaseYear{
        if(purchaseYear<0) {
            throw new NegativePurchaseYear("Be careful! Purchase year is negative! ");
        }
        this.purchaseYear = purchaseYear;
    }

    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }

    abstract void moveToService();

    public final void changeTires(){
        if (Weather.getTodayWeather()<WEATHER_TO_CHANGE_TIRES) {
            System.out.println("Need to change tires! ");
        }
    }
}
