package CLasses;

import Interface.IMoveable;
import enums.DriveCategory;

public class Driver extends Employee implements IMoveable {

    private boolean alcoholFree;
    private DriveCategory driveCategory;

    public Driver() {
    }

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



    @Override
    public void driveTo() {
        System.out.println("Driver "+getPersonName()+ " with " +driveCategory +" go to object! ");
    }

    @Override
    public void goToBoss() {
        System.out.println("Driver "+getPersonName()+ " with " +driveCategory +" go to boss! ");
    }

}
