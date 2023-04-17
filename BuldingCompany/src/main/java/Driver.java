public class Driver extends Worker{

    private boolean alcoholFree;
    private DriveCategory driveCategory;

    public Driver(String workerName, int workerAge, int workerGrowth, boolean alcoholFree, DriveCategory driveCategory) {
        super(workerName, workerAge, workerGrowth);
        this.alcoholFree = alcoholFree;
        this.driveCategory = driveCategory;
    }


    public boolean isAlcoholFree() {
        return alcoholFree;
    }

    public void setAlcoholFree(boolean alcoholFree) {
        this.alcoholFree = alcoholFree;
    }

    public DriveCategory getDriveCategory() {
        return driveCategory;
    }

    public void setDriveCategory(DriveCategory driveCategory) {
        this.driveCategory = driveCategory;
    }

}
