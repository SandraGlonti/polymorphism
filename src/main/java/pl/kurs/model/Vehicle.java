package pl.kurs.model;

public class Vehicle {
    private String name;
    private int power;

    public Vehicle() {
    }

    public Vehicle(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void makeSound(){
        System.out.println("Jestem " + name + " i jestem typu:" + Vehicle.class.getName());
    }
    public final void drive(){
        System.out.println("Driving");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
