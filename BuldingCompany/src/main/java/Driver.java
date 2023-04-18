public class Driver extends Employee{

    private boolean alcoholFree;
    private DriveCategory driveCategory;

    public Driver(String personName, int personAge, int salary, int id, int employeeGrowth, boolean alcoholFree, DriveCategory driveCategory) {
        super(personName, personAge, salary, id, employeeGrowth);
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
