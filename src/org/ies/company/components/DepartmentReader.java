package org.ies.company.components;

import org.ies.company.model.Department;
import org.ies.company.model.Employee;

import java.util.Scanner;

public class DepartmentReader {
    private final Scanner scanner;
    private final EmployeeReader employeeReader;

    public DepartmentReader(Scanner scanner, EmployeeReader employeeReader) {
        this.scanner = scanner;
        this.employeeReader = employeeReader;
    }

    public Department read() {
        System.out.println("Vamos a introducir los datos del departamento:");
        System.out.println("¿Cuál es el nombre del departamento?:");
        var name = scanner.nextLine();

        System.out.println("¿Cuál es el presupuesto?:");
        var budget = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ahora vamos con los datos de los empleados:");
        System.out.println("¿Cuántos empleados va a tener?");
        var size = scanner.nextInt();
        scanner.nextLine();

        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            employees[i] = employeeReader.read();
        }

        return new Department(
                name,
                budget,
                employees
        );
    }
}
