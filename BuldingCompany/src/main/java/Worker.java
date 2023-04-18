public class Worker {
    protected String workerName;
    protected int workerAge;
    protected int workerGrowth;
    public static int workersCount;

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public int getWorkerAge() {
        return workerAge;
    }

    public void setWorkerAge(int workerAge) {
        this.workerAge = workerAge;
    }

    public int getWorkerGrowth() {
        return workerGrowth;
    }

    public void setWorkerGrowth(int workerGrowth) {
        this.workerGrowth = workerGrowth;
    }

    public static int getWorkersCount() {
        return workersCount;
    }

    public Worker(String workerName, int workerAge, int workerGrowth) {
        this.workerName = workerName;
        this.workerAge = workerAge;
        this.workerGrowth = workerGrowth;
    }


}
