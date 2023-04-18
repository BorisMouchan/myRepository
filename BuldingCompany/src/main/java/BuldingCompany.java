public class BuldingCompany {
    public static void main(String[] args) {
//        Worker electric1 = new Electric("Vasya", 25,180,true,true,5);
//        System.out.println(electric1.getWorkerAge());
        Worker arch1 = new Architector("dima",35,180,true,10,5000);
        Accounting accounting1 = new Accounting("MainAccounting",3,15,5000);

        Project project1 = new Project("DOM",ProjectType.COTTAGE,5,arch1.getWorkerName());
        System.out.println(project1);
    }

}
