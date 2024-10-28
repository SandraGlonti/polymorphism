package pl.kurs.homework.model;

public class Programmer extends Employee{
    private String technologyStack;

    public Programmer() {
    }

    public Programmer(String firstName, String lastName, double salary, String technologyStack) {
        super(firstName, lastName, salary);
        this.technologyStack = technologyStack;
    }

    public String getTechnologyStack() {
        return technologyStack;
    }

    public void setTechnologyStack(String technologyStack) {
        this.technologyStack = technologyStack;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", salary=" + getSalary() + '\'' +
                ", technologyStack='" + technologyStack + '\'' +
                '}';
    }
}
