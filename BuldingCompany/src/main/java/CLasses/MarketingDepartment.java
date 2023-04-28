package CLasses;

import Interface.IPayments;
import enums.AdvertisingType;

public class MarketingDepartment extends Department {

    private static int activeAdvertisingCount;
    public AdvertisingType advertisingType;

    public MarketingDepartment() {
    }

    public MarketingDepartment(String structureName, int employersNumber, AdvertisingType advertisingType) {
        super(structureName, employersNumber);
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

    @Override
    protected void getResultsOfMonth() {
        System.out.println(activeAdvertisingCount);
    }

    public static void addAdvertising(){
        activeAdvertisingCount++;
    }

    public static void removeAdvertising() {
        activeAdvertisingCount--;
    }
}
