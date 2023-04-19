package CLasses;

public class Plumber extends Employee {

    public Plumber(String personName, int personAge, int salary, int id, int employeeGrowth) {
        super(personName, personAge, salary, id, employeeGrowth);
    }
    private boolean highEducation;

    public boolean isHighEducation() {
        return highEducation;
    }

}
