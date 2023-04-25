package CLasses;

import Interface.IPayments;

import java.time.LocalDate;

public class PaymentsDepartment extends Department implements IPayments {

    private int dayOfSalary=15;
    private int monthSalary;
    private static final int daysInYear = 365;

    public PaymentsDepartment() {
    }

    public PaymentsDepartment(String structureName, int employersNumber, int dayOfSalary, int monthSalary) {
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


    @Override
    public void makePayments() {
        if (dayOfSalary == LocalDate.EPOCH.getDayOfMonth()) {
            System.out.println("Payments done! ");
        } else {
            System.out.println("Its not salary day :( ");
        }

    }

    @Override
    protected void getResultsOfMonth() {
        System.out.println("Total month salary " + getMonthSalary());
    }
}
