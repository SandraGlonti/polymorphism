package pl.kurs.homework.model;

public class Tester extends Employee{
    private boolean isAutomaticTester;
    private boolean isManualTester;

    public Tester() {
    }

    public Tester(String firstName, String lastName, double salary, boolean isAutomaticTester, boolean isManualTester) {
        super(firstName, lastName, salary);
        this.isAutomaticTester = isAutomaticTester;
        this.isManualTester = isManualTester;
    }

    public boolean isAutomaticTester() {
        return isAutomaticTester;
    }

    public void setAutomaticTester(boolean automaticTester) {
        isAutomaticTester = automaticTester;
    }

    public boolean isManualTester() {
        return isManualTester;
    }

    public void setManualTester(boolean manualTester) {
        isManualTester = manualTester;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", salary=" + getSalary() + '\'' +
                ", isAutomaticTester=" + isAutomaticTester +
                ", isManualTester=" + isManualTester +
                '}';
    }

}
