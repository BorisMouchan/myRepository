package CLasses;

import Exceptions.AgeException;
import Interface.IMoveable;
import enums.DriveCategory;

public class Driver extends Employee implements IMoveable {

    private DriveCategory driveCategory;

    public Driver() {
    }

    public Driver(String personName, int personAge, int salary, DriveCategory driveCategory) throws AgeException {
        super(personName, personAge, salary);
        if(personAge<0 || personAge>65) {
            throw new AgeException("Age is not correct! ");
        }
        this.driveCategory = driveCategory;
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
