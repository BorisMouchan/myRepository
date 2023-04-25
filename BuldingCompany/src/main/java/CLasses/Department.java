package CLasses;

public abstract class Department {

    protected String structureName;
    protected int employersNumber;

    public Department() {
    }

    public Department(String structureName, int employersNumber) {
        this.structureName = structureName;
        this.employersNumber = employersNumber;
    }

    public String getStructureUnitName() {
        return structureName;
    }

    public void setStructureUnitName(String structureName) {
        this.structureName = structureName;
    }

    public int getEmployersNumber() {
        return employersNumber;
    }

    public void setEmployersNumber(int employersNumber) {
        this.employersNumber = employersNumber;
    }

    protected abstract void getResultsOfMonth();
}
