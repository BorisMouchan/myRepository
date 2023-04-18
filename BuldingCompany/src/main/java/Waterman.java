public class Waterman extends Worker{

    private boolean highEducation;

    public Waterman(String workerName, int workerAge, int workerGrowth, boolean highEducation) {
        super(workerName, workerAge, workerGrowth);
        this.highEducation = highEducation;
    }


}
