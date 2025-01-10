package org.ies.company.components;

import java.util.Scanner;

public class CompanyApp {
    private final Scanner scanner;
    private final CompanyReader companyReader;

    public CompanyApp(Scanner scanner, CompanyReader companyReader) {
        this.scanner = scanner;
        this.companyReader = companyReader;
    }

    public void run() {
        var company = companyReader.read();
        int option;
        do {
            option = chooseOption();
            if (option == 1) {
                System.out.println("Introduce el nombre del departamento");
                var name = scanner.nextLine();
                company.departmentInfo(name);
            } else if (option == 2) {
                System.out.println("Introduce el nombre del departamento");
                var name = scanner.nextLine();
                company.departmentEmployees(name);
            } else if (option == 3) {
                System.out.println("Introduce el nombre del departamento");
                var name = scanner.nextLine();
                System.out.println("Introduce el nif del empleado");
                var nif = scanner.nextLine();
                company.employeeInfo(name, nif);
            }
        } while (option != 4);
    }

    private int chooseOption() {
        int option;
        do {
            System.out.println("Elige una opción");
            System.out.println("1. Mostrar datos de un departamento");
            System.out.println("2. Mostrar empleados de un departamento");
            System.out.println("3. Mostrar datos de un empleado de un departamento");
            System.out.println("4. salir");
            option = scanner.nextInt();
            scanner.nextLine();
        } while (option < 1 || option > 4);
        return option;
    }
}