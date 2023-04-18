public abstract class MarketingDepartment extends Department{

    private static int activeAdvertisingCount;
    private int totalAdvertisingCost;
    public AdvertisingType advertisingType;

    public MarketingDepartment(String structureName, int employersNumber, int totalAdvertisingCost, AdvertisingType advertisingType) {
        super(structureName, employersNumber);
        this.totalAdvertisingCost = totalAdvertisingCost;
        this.advertisingType = advertisingType;
    }

    public AdvertisingType getAdvertisingType() {
        return advertisingType;
    }

    public void setAdvertisingType(AdvertisingType advertisingType) {
        this.advertisingType = advertisingType;
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
