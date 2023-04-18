public class Architector extends Worker{

    private boolean autocadUsing;
    private int projectDone;
    private int salary;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Architector(String workerName, int workerAge, int workerGrowth, boolean autocadUsing, int projectDone, int salary) {
        super(workerName, workerAge, workerGrowth);
        this.autocadUsing = autocadUsing;
        this.projectDone = projectDone;
        this.salary = salary;
    }



}
