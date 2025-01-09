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

        int option;
        do {
            System.out.println("Elige el puesto de trabajo:");
            System.out.println("1. Programador");
            System.out.println("2. Jefe de proyecto");
            System.out.println("3. Diseñador gráfico");
            System.out.println("4. Administrador de sistemas");
            option = scanner.nextInt();
            scanner.nextLine();
        } while (option != 1 && option != 2 && option != 3 && option != 4);

        JobPosition jobPosition;
        if (option == 1) {
            jobPosition = JobPosition.Programador;
        } else if (option == 2) {
            jobPosition = JobPosition.Jefe_de_proyecto;
        } else if (option == 3) {
            jobPosition = JobPosition.Diseñador_gráfico;
        } else {
            jobPosition = JobPosition.Administrador_de_sistemas;
        }

        return new Employee(
                nif,
                name,
                surname,
                jobPosition
        );
    }
}
