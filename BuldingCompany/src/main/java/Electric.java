public class Electric extends Worker {

    public boolean insurance;
    public boolean accreditation;
    public int worksYearExperience;

    public Electric(String workerName, int workerAge, int workerGrowth, boolean insurance, boolean accreditation, int worksYearExperience) {
        super(workerName, workerAge, workerGrowth);
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


}
