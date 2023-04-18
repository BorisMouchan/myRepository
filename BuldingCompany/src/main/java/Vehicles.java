public abstract class Vehicles {

    protected String vehicleName;
    protected int purchaseYear;
    protected boolean warranty;

    public Vehicles(String vehicleName, int purchaseYear, boolean warranty) {
        this.vehicleName = vehicleName;
        this.purchaseYear = purchaseYear;
        this.warranty = warranty;
    }

}
