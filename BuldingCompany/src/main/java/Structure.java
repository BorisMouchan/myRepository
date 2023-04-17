public class Structure {
    protected String structureName;
    protected int employersNumber;

    public Structure(String structureName, int employersNumber) {
        this.structureName = structureName;
        this.employersNumber = employersNumber;
    }

    public String getStructureName() {
        return structureName;
    }

    public void setStructureName(String structureName) {
        this.structureName = structureName;
    }

    public int getEmployersNumber() {
        return employersNumber;
    }

    public void setEmployersNumber(int employersNumber) {
        this.employersNumber = employersNumber;
    }


}
