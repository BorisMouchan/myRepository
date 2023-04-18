public class Marketing extends StructureUnit{

    private int activeAdvertisingCount;
    private int totalAdvertisingCost;
    public AdvertisingType advertisingType;

    public AdvertisingType getAdvertisingType() {
        return advertisingType;
    }

    public void setAdvertisingType(AdvertisingType advertisingType) {
        this.advertisingType = advertisingType;
    }

    public Marketing(String structureName, int employersNumber) {
        super(structureName, employersNumber);
    }

    public int getActiveAdvertisingCount() {
        return activeAdvertisingCount;
    }

    public void setActiveAdvertisingCount(int activeAdvertisingCount) {
        this.activeAdvertisingCount = activeAdvertisingCount;
    }

    public int getTotalAdvertisingCost() {
        return totalAdvertisingCost;
    }

    public void setTotalAdvertisingCost(int totalAdvertisingCost) {
        this.totalAdvertisingCost = totalAdvertisingCost;
    }


}
