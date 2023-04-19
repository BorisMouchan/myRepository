package CLasses;

public abstract class ArchiveData extends Department {
    public static int totalProjectsDone;
    public static int totalProjectsCost;

    public ArchiveData(String structureName, int employersNumber) {
        super(structureName, employersNumber);
    }
}
