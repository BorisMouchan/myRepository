public class Machine {

    protected String manufacterName;
    protected int purchaseYear;
    protected int warranty;
    public static int machineCount;

    public Machine(String manufacterName, int purchaseYear, int warranty) {
        this.manufacterName = manufacterName;
        this.purchaseYear = purchaseYear;
        this.warranty = warranty;
    }

    public String getManufacterName() {
        return manufacterName;
    }

    public void setManufacterName(String manufacterName) {
        this.manufacterName = manufacterName;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public void setPurchaseYear(int purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

}
