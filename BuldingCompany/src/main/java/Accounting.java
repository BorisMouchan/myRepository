public class Accounting extends Structure{

    private int dayOfSalary;
    private int maxSalary;

    public Accounting(String structureName, int employersNumber, int dayOfSalary, int maxSalary) {
        super(structureName, employersNumber);
        this.dayOfSalary = dayOfSalary;
        this.maxSalary = maxSalary;
    }

    public void setDayOfSalary(int dayOfSalary) {
        this.dayOfSalary = dayOfSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getDayOfSalary() {
        return dayOfSalary;
    }

}
