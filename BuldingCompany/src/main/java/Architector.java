public class Architector extends Worker{
    public boolean autocadUsing;
    public int projectDone;
    public int salary;

    public Architector(String workerName, int workerAge, int workerGrowth, boolean autocadUsing, int projectDone, int salary) {
        super(workerName, workerAge, workerGrowth);
        this.autocadUsing = autocadUsing;
        this.projectDone = projectDone;
        this.salary = salary;
    }



}
