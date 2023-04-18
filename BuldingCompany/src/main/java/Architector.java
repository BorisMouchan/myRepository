public class Architector extends Employee{

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


}
