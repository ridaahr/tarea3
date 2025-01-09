package org.ies.company.model;

import java.util.Objects;

public class Employee {
    private String nif;
    private String name;
    private String surname;
    private JobPosition jobPosition;

    public Employee(String nif, String name, String surname, JobPosition jobPosition) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.jobPosition = jobPosition;
    }

    public void employeeInfo() {
        System.out.println("NIF: " + nif + ". Nombre: " + name + ". Apellidos: " + surname + ". Puesto de trabajo: " + jobPosition);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(nif, employee.nif) && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && jobPosition == employee.jobPosition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, jobPosition);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", jobPosition=" + jobPosition +
                '}';
    }
}
