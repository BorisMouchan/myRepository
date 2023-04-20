package CLasses;

import java.util.Objects;

public class Electric extends Employee {

    private boolean insurance;
    private boolean accreditation;
    private int worksYearExperience;

    public Electric(String personName, int personAge, int salary, int id, int employeeGrowth, boolean insurance, boolean accreditation, int worksYearExperience) {
        super(personName, personAge, salary, id, employeeGrowth);
        this.insurance = insurance;
        this.accreditation = accreditation;
        this.worksYearExperience = worksYearExperience;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public boolean isAccreditation() {
        return accreditation;
    }

    public void setAccreditation(boolean accreditation) {
        this.accreditation = accreditation;
    }

    public int getWorksYearExperience() {
        return worksYearExperience;
    }

    public void setWorksYearExperience(int worksYearExperience) {
        this.worksYearExperience = worksYearExperience;
    }


    @Override
    public String toString() {
        return "Electric{" +
                "insurance=" + insurance +
                ", accreditation=" + accreditation +
                ", worksYearExperience=" + worksYearExperience +
                ", employeeGrowth=" + employeeGrowth +
                ", salary=" + salary +
                ", personName='" + personName + '\'' +
                ", personAge=" + personAge +
                ", id=" + id +
                "} " + super.toString();
    }

    @Override
    public void printPersonInfo() {
        System.out.println("My electric info: " + getPersonName() +" "+ getPersonAge() + " Expirience: " + getWorksYearExperience());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), insurance, accreditation, worksYearExperience);
    }
}
