public class Project {

    public String projectName;
    public ProjectType projectType;
    public int projectCost;
    public String architectorName;

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

    public String getArchitectorName() {
        return architectorName;
    }

    public void setArchitectorName(String architectorName) {
        this.architectorName = architectorName;
    }

    public Project(String projectName, ProjectType projectType, int projectCost, String architectorName) {
        this.projectName = projectName;
        this.projectType = projectType;
        this.projectCost = projectCost;
        this.architectorName = architectorName;
    }

}
