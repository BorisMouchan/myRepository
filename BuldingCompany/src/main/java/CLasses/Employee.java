package CLasses;

import Exceptions.AgeException;
import Exceptions.PrintNullException;
import Interface.IPrintablle;

import java.util.Objects;

public class Employee extends Person implements IPrintablle {

    protected int salary;
    public static int employersCount;

    public Employee() {
    }

    public Employee(String personName, int personAge,  int salary) throws AgeException {
        super(personName, personAge);
        this.salary = salary;
    }

    public Employee(String personName, int personAge) throws AgeException {
        super(personName,personAge);
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
        return "Name: " + getPersonName()+ "\n" + "Age: " +getPersonAge() + "\n" + "\n"+
                 "\n" +
                "salary: " + getSalary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return personAge == employee.personAge &&   salary == employee.salary && Objects.equals(personName, employee.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), personName, personAge,  salary);
    }


    @Override
    public void printPersonalInfo() throws PrintNullException {

    }
}
