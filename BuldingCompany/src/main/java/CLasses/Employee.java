package CLasses;

import java.util.Objects;

public class Employee extends Person {

    protected int employeeGrowth;
    protected int salary;
    public static int employersCount;

    public Employee(String personName, int personAge, int id) {
        super(personName, personAge, id);
    }

    public Employee(String personName, int personAge, int id, int employeeGrowth, int salary) {
        super(personName, personAge, id);
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

    @Override
    public String toString() {
        return "Name: " + getPersonName()+ "\n" + "Age: " +getPersonAge() + "\n" + "id: " + getId() + "\n"+
                "Growth: " + getEmployeeGrowth() + "\n" +
                "salary: " + getSalary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return personAge == employee.personAge && id == employee.id && employeeGrowth == employee.employeeGrowth && salary == employee.salary && Objects.equals(personName, employee.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), personName, personAge, id, employeeGrowth, salary);
    }

    public void printPersonInfo() {
        System.out.println("Employee " + getPersonName()+  "personal info");
    }

}
