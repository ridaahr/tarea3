package org.ies.company.components;

import org.ies.company.model.Employee;
import org.ies.company.model.JobPosition;

import java.util.Scanner;

public class EmployeeReader {
    private final Scanner scanner;

    public EmployeeReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Employee read() {
        System.out.println("Datos del empleado:");
        System.out.println("Introduce el NIF: ");
        var nif = scanner.nextLine();

        System.out.println("Introduce el nombre:");
        var name = scanner.nextLine();

        System.out.println("Introduce los apellidos:");
        var surname = scanner.nextLine();

        System.out.println("Introduce el puesto de trabajo");
        var jobPosition = scanner.nextLine();

        return new Employee(
                nif,
                name,
                surname,
                jobPosition
        );
    }
}
