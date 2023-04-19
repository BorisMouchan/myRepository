package CLasses;

import java.util.Objects;

public class Architector extends Employee {

    private boolean autocadUsing;
    private int projectDone;

    public Architector(String personName, int personAge, int salary, int id, int employeeGrowth, boolean autocadUsing, int projectDone) {
        super(personName, personAge, salary, id, employeeGrowth);
        this.autocadUsing = autocadUsing;
        this.projectDone = projectDone;
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
        return "Name: " + getPersonName()+ "\n" + "Age: " +getPersonAge() + "\n" + "id: " + getId() + "\n"+
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
        return autocadUsing == that.autocadUsing && projectDone == that.projectDone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), autocadUsing, projectDone);
    }
}
