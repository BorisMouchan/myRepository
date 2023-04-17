public class Building extends Structure{
    public static int totalProjectsDone;
    public static int totalProjectsCost;


    public static int getTotalProjectsDone() {
        return totalProjectsDone;
    }

    public static void setTotalProjectsDone(int totalProjectsDone) {
        Building.totalProjectsDone = totalProjectsDone;
    }

    public static int getTotalProjectsCost() {
        return totalProjectsCost;
    }

    public static void setTotalProjectsCost(int totalProjectsCost) {
        Building.totalProjectsCost = totalProjectsCost;
    }

    public Building(String structureName, int employersNumber) {
        super(structureName, employersNumber);
    }
}
