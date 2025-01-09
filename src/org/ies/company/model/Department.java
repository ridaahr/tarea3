package org.ies.company.model;

import java.util.Arrays;
import java.util.Objects;

public class Department {
    private String name;
    private double budget;
    private Employee[] employees;

    public Department(String name, double budget, Employee[] employees) {
        this.name = name;
        this.budget = budget;
        this.employees = employees;
    }

    public void departmentInfo() {
        System.out.println("Nombre: " + name + ". Presupuesto: " + budget);
        System.out.println("Empleados: ");
        for (var employee: employees) {
            employee.employeeInfo();
        }
    }

    public void departmentEmployeesInfo() {
        for (var employee: employees) {
            employee.employeeInfo();
        }
    }

    public Employee hasEmployee(String nif) {
        for (var employee: employees) {
            if (employee.getNif().equals(nif)) {
                return employee;
            }
        }   return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Double.compare(budget, that.budget) == 0 && Objects.equals(name, that.name) && Objects.deepEquals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, budget, Arrays.hashCode(employees));
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
