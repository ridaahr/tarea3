package org.ies.company.components;

import org.ies.company.model.Company;
import org.ies.company.model.Department;

import java.util.Scanner;

public class CompanyReader {
    private final Scanner scanner;
    private final DepartmentReader departmentReader;

    public CompanyReader(Scanner scanner, DepartmentReader departmentReader) {
        this.scanner = scanner;
        this.departmentReader = departmentReader;
    }

    public Company read() {
        System.out.println("Introduce el nombre de la empresa:");
        var name = scanner.nextLine();

        System.out.println("Introduce el CIF:");
        var cif = scanner.nextLine();

        System.out.println("¿Cuántos departamentos va a tener?");
        var size = scanner.nextInt();
        scanner.nextLine();

        Department[] departments = new Department[size];
        for (int i = 0; i < size; i++) {
            departments[i] = departmentReader.read();
        }

        return new Company(
                name,
                cif,
                departments
        );
    }
}
