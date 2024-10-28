package pl.kurs.homework.service;

import pl.kurs.homework.model.Employee;

public class SoftwareHouse {
    private Employee[] employees;
    private int count;

    public SoftwareHouse(int capacity) {
        this.employees = new Employee[capacity];
        this.count = 0;
    }

    public void add(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;

        } else {
            System.out.println("Brak możliwości dodania pracownika");
        }
    }

    public String getInfo() {
        String info = "Software House Employees:\n";
        for (int i = 0; i < count; i++) {
            info += employees[i].toString() + "\n";
        }
        return info;

    }
}
