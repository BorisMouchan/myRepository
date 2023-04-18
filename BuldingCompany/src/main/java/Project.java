public class Project {

    private String projectName;
    private ProjectType projectType;
    private int projectCost;
    private Architector architectorName;

    public Project(String projectName, ProjectType projectType, int projectCost, Architector architectorName) {
        this.projectName = projectName;
        this.projectType = projectType;
        this.projectCost = projectCost;
        this.architectorName = architectorName;
    }
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ProjectType getProjectType() {
        return projectType;
    }

    public void setProjectType(ProjectType projectType) {
        this.projectType = projectType;
    }

    public int getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(int projectCost) {
        this.projectCost = projectCost;
    }

    public Architector getArchitectorName() {
        return architectorName;
    }

    public void setArchitectorName(Architector architectorName) {
        this.architectorName = architectorName;
    }

    @Override
    public String toString() {
        return "название проекта " + projectName + "\n" +"тип дома " + projectType + "\n" + "стоимость проекта " + projectCost
                + "\n" + "имя архитектора " + architectorName;
    }
}

