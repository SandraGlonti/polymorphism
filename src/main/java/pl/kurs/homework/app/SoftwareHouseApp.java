package pl.kurs.homework.app;

import pl.kurs.homework.model.Employee;
import pl.kurs.homework.model.Programmer;
import pl.kurs.homework.model.ProjectManager;
import pl.kurs.homework.model.Tester;
import pl.kurs.homework.service.SoftwareHouse;

public class SoftwareHouseApp {
    public static void main(String[] args) {

        SoftwareHouse softwareHouse = new SoftwareHouse(2);
        Employee programmer =  new Programmer("Sandra", "Glonti", 20000.00,"Java");
        Employee tester = new Tester("Tomasz", "Piekarski",45000,true,true);
        Employee projectManager = new ProjectManager("Waldemar", "Pietrzak",10000,false);

        softwareHouse.add(programmer);
        softwareHouse.add(tester);
        softwareHouse.add(projectManager);

        System.out.println(softwareHouse.getInfo());

    }
}
