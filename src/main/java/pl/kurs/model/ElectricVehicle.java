package pl.kurs.model;

public class ElectricVehicle extends Vehicle {
    private int electricityConsumption;

    public ElectricVehicle() {
        super(); // domyslnie tego konstruktora tutaj nie dodajemy, ale jest dodany automattycznie
    }

    public ElectricVehicle(String name, int power, int electricityConsumption) {
        super(name, power); // wywolanie konstruktora klasy nadrzednej
        this.electricityConsumption = electricityConsumption;
    }

    public int getElectricityConsumption() {
        return electricityConsumption;
    }

    public void setElectricityConsumption(int electricityConsumption) {
        this.electricityConsumption = electricityConsumption;
    }

    @Override
    public void makeSound() {

        System.out.println("Jestem " + getName() + " i jestem typu:" + ElectricVehicle.class.getName());
    }

//    public void drive(){ <--- metoda finalna, nie mozemy jej nadpisac w klasie podrzednej
//
//    }

    public void chargeBattery(){
        System.out.println("Ładuję baterie");
    }

    @Override
    public String toString() {
        return "ElectricVehicle{" +
                "name=" + getName() +
                " power=" + getPower() +
                " electricityConsumption=" + electricityConsumption +
                '}';
    }
}
