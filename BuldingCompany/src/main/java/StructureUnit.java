public class StructureUnit {
    protected String structureName;
    protected int employersNumber;

    public StructureUnit(String structureName, int employersNumber) {
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


}
