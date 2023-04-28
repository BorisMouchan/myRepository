package CLasses;

import Exceptions.AgeException;

import java.util.Objects;

public class Architector extends Employee {

    private boolean autocadUsing;
    private int projectDone;

    public Architector() {
    }

    public Architector(String personName, int personAge, int salary, int id, int employeeGrowth, boolean autocadUsing, int projectDone) throws AgeException {
        super(personName, personAge, salary, id, employeeGrowth);
        if(personAge<0 || personAge>65) {
            throw new AgeException("Age is not correct! ");
        }
        this.autocadUsing = autocadUsing;
        this.projectDone = projectDone;
    }

    public Architector(String personName, int personAge, int id) {
        super(personName, personAge, id);
    }

    public Architector(String personName, int personAge) throws AgeException {
        super(personName, personAge);
        if(personAge<0 || personAge>65) {
            throw new AgeException("Age is not correct! ");
        }
    }

    public boolean isAutocadUsing() {
        return autocadUsing;
    }

    public void setAutocadUsing(boolean autocadUsing) {
        this.autocadUsing = autocadUsing;
    }

    public int getProjectDone() {
        return projectDone;
    }

    public void setProjectDone(int projectDone) {
        this.projectDone = projectDone;
    }

    @Override
    public String toString() {
        return "Name: " + getPersonName()+ "\n" +
                "Age: " +getPersonAge() + "\n" +
                "id: " + getId() + "\n"+
                "AutocadUsing: " + autocadUsing + "\n"+
                "ProjectDone: " + projectDone + "\n" +
                "Growth: " + employeeGrowth +
                "Salary: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Architector that = (Architector) o;
        return personAge == that.personAge && id == that.id && employeeGrowth == that.employeeGrowth && salary == that.salary && autocadUsing == that.autocadUsing && projectDone == that.projectDone && Objects.equals(personName, that.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), personName, personAge, id, employeeGrowth, salary, autocadUsing, projectDone);
    }
}
