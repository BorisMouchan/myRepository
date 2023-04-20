package CLasses;

public class ArchiveData extends Department {
    public static int totalProjectsDone;
    public static int totalProjectsCost;

    public ArchiveData(String structureName, int employersNumber) {
        super(structureName, employersNumber);
    }

    public static int getTotalProjectsDone() {
        return totalProjectsDone;
    }

    public static void setTotalProjectsDone(int totalProjectsDone) {
        ArchiveData.totalProjectsDone = totalProjectsDone;
    }

    public static int getTotalProjectsCost() {
        return totalProjectsCost;
    }

    public static void setTotalProjectsCost(int totalProjectsCost) {
        ArchiveData.totalProjectsCost = totalProjectsCost;
    }

    @Override
    protected void getResultsOfMonth() {
        System.out.println("Total cost^ " + getTotalProjectsCost());
        System.out.println("Total projects done " + getTotalProjectsDone());
    }

    public static void addProjectData(){
        totalProjectsDone++;
    }
}
