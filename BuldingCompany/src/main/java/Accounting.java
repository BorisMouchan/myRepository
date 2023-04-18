public class Accounting extends StructureUnit{

    private int dayOfSalary;
    private int monthSalary;

    public Accounting(String structureName, int employersNumber, int dayOfSalary, int monthSalary) {
        super(structureName, employersNumber);
        this.dayOfSalary = dayOfSalary;
        this.monthSalary = monthSalary;
    }

    public int getDayOfSalary() {
        return dayOfSalary;
    }

    public void setDayOfSalary(int dayOfSalary) {
        this.dayOfSalary = dayOfSalary;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

}
