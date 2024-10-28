package pl.kurs.homework.model;

public class ProjectManager extends Employee{
    private boolean makingLifeDificult;

    public ProjectManager() {
    }

    public ProjectManager(String firstName, String lastName, double salary, boolean makingLifeDificult) {
        super(firstName, lastName, salary);
        this.makingLifeDificult = makingLifeDificult;
    }

    public boolean isMakingLifeDificult() {
        return makingLifeDificult;
    }

    public void setMakingLifeDificult(boolean makingLifeDificult) {
        this.makingLifeDificult = makingLifeDificult;
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", salary=" + getSalary() + '\'' +
                ", makingLifeDificult=" + makingLifeDificult +
                '}';
    }
}
