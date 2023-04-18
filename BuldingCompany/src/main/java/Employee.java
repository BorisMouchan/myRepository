public class Employee extends Person {
    protected int employeeGrowth;
    protected int salary;
    public static int employersCount;

    public Employee(String personName, int personAge, int salary, int id, int employeeGrowth) {
        super(personName, personAge, salary, id);
        this.employeeGrowth = employeeGrowth;
        this.salary = salary;
    }

    public int getEmployeeGrowth() {
        return employeeGrowth;
    }

    public void setEmployeeGrowth(int employeeGrowth) {
        this.employeeGrowth = employeeGrowth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getEmployersCount() {
        return employersCount;
    }

    public static void setEmployersCount(int employersCount) {
        Employee.employersCount = employersCount;
    }


}
