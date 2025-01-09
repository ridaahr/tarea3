package org.ies.company.model;

import java.util.Arrays;
import java.util.Objects;

public class Company {
    private String name;
    private String cif;
    private Department[] departments;

    public Company(String name, String cif, Department[] departments) {
        this.name = name;
        this.cif = cif;
        this.departments = departments;
    }

    public Department hasDepartment(String name) {
        for (var department : departments) {
            if (department.getName().equals(name)) {
                return department;
            }
        }
        return null;
    }

    public void departmentInfo(String name) {
        var department = hasDepartment(name);
        if (department != null) {
            department.departmentInfo();
        } else {
            System.out.println("No se encuentra el departamento.");
        }
    }

    public void departmentEmployees(String name) {
        var department = hasDepartment(name);
        if (department != null){
            department.departmentEmployeesInfo();
        }
    }

    public void employeeInfo(String name, String nif) {
        var department = hasDepartment(name);
        if (department != null) {
            var employee = department.hasEmployee(nif);
            if (employee != null) {
                employee.employeeInfo();
            }   else {
                System.out.println("No se encuentra el empleado en el departamento");
            }
        }   else {
            System.out.println("No existe el departamento");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(cif, company.cif) && Objects.deepEquals(departments, company.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cif, Arrays.hashCode(departments));
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", departments=" + Arrays.toString(departments) +
                '}';
    }
}