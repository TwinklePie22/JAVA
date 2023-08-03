package JAVA_INTERNAL;
import java.util.Scanner;
public class EmployeeDetails {
        public static void main(String[] args) {
            // Employee data stored in arrays
            int[] empIds = {101, 102, 103, 104, 105};
            String[] empNames = {"John", "Alice", "Bob", "Emma", "David"};
            String[] empDesignations = {"Manager", "Engineer", "Analyst", "Developer", "Tester"};
            double[] empSalaries = {50000.0, 45000.0, 40000.0, 42000.0, 38000.0};
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.close();

            // Search for the employee in the array using the entered ID
            int index = -1;
            for (int i = 0; i < empIds.length; i++) {
                if (empIds[i] == empId) {
                    index = i;
                    break;
                }
            }

            // Display the details of the employee if found, otherwise show an error message
            if (index != -1) {
                System.out.println("Employee ID: " + empIds[index]);
                System.out.println("Employee Name: " + empNames[index]);
                System.out.println("Employee Designation: " + empDesignations[index]);
                System.out.println("Employee Salary: $" + empSalaries[index]);
            } else {
                System.out.println("Employee not found with ID: " + empId);
            }
        }
    }


