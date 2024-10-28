package pl.kurs.app;

import pl.kurs.model.ElectricVehicle;
import pl.kurs.model.InternalCombustionVehicle;
import pl.kurs.model.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Pojazd", 100);
        Vehicle electricVehicle = new ElectricVehicle("Tesla", 490, 100);
        Vehicle internalCombustionVehicle = new InternalCombustionVehicle("Audi", 350, 14);

        //internalCombustionVehicle.test();
        // metoda .test() nie jest widoczna, poniewaz obiekt internalCombustionVehichle
        // ma typ ogolny Vehicle, a klasa Vehicle nie posiada metody test()

//        vehicle.makeSound();
//        electricVehicle.makeSound();
//        internalCombustionVehicle.makeSound();
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = vehicle;
        vehicles[1] = electricVehicle;
        vehicles[2] = internalCombustionVehicle;

        for (Vehicle v : vehicles) {
            v.makeSound();
        }
        changeVehicleName(vehicle, "Rower");
        changeVehicleName(electricVehicle, "Porsche");

        for (Vehicle v : vehicles) {
            v.makeSound();
        }
        System.out.println("-----------------------------");

        //Rzutowanie

        Vehicle gasolineCar = new InternalCombustionVehicle();
        //gasolineCar.refuel(); brak dostępu do metody.
        Vehicle electricCar = new ElectricVehicle();
        //electricCar.chargeBattery(); brak dostępu do metody.

        // rzutowanie do zmiennej, z typu ogolnego na bardziej szczegolow
        ElectricVehicle moreSpecificElectricCar = (ElectricVehicle) electricCar;
        moreSpecificElectricCar.chargeBattery();

        // rzutowanie w locie, z typu ogolnego na bardziej szczegolowy
        ((InternalCombustionVehicle) gasolineCar).refuel();

        //rzutowanie do zmiennej, z typu szczegolowego na ogolny
        Vehicle electricCar2 = moreSpecificElectricCar;

        if (moreSpecificElectricCar instanceof Vehicle) {
            System.out.println("moreSpecificElectricCar dziedziczy po Vehicle");
        } else {
            System.out.println("moreSpecificElectricCar nie dziedziczy po Vehicle");
        }

        for (Vehicle vehicle1 : vehicles) {
            if (vehicle1 instanceof InternalCombustionVehicle) {
                InternalCombustionVehicle vehicle2 = (InternalCombustionVehicle) vehicle1;
            } else if (vehicle1 instanceof ElectricVehicle) {
                ElectricVehicle vehicle2 = (ElectricVehicle) vehicle1;
            }
        }
    }

    public static void changeVehicleName(Vehicle vehicle, String name) {
        vehicle.setName(name);
    }

}
