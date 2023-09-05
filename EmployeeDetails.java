package JAVA_INTERNAL;
import java.util.*;

public class Employee {

        public static void main(String[] args)
        {
            System.out.println("Enter Valid Employee ID : \n");
            int[] EmpId={1001,1002,1003,1004,1005,1006,1007};
            String[] EmpName={"Abc","Opqr","Ghi","Wxyz","Jklmn","Stuv","Def"};
            String[] JoinDate={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
            char[] DesigCode={'e','c','k','r','m','e','c'};
            String[] Department={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
            double[] Basic={20000,30000,10000,12000,50000,23000,29000};
            double[] HRA={8000,12000,8000,6000,20000,9000,12000};
            double[] IT={3000,9000,1000,2000,20000,4400,10000};
            char[] DesignationCode={'e','c','k','r','m'};
            String[] Designation={"Engineer","Consultant","Clerk","Receptionist","Manager"};
            double[] DA={20000,32000,12000,15000,40000};
            int flag=0;
            int id=Integer.parseInt(args[0]);

            for(int i=0;i<EmpId.length;i++)
            {
                if(EmpId[i]==id)
                {
                    flag=1;
                    System.out.println("Emp Id.	 Emp Name	Department	Designation	   DA");
                    System.out.print(EmpId[i]+" 	  "+EmpName[i]+" 		"+Department[i]);
                    for(int j=0;j<DesignationCode.length;j++)
                    {
                        if(DesigCode[i]==DesignationCode[j])
                        {	System.out.print(" 		"+Designation[j]+" 	");
                            double sum=Basic[i]+HRA[i]+DA[j]-IT[i];
                            System.out.print(sum);
                        }
                    }
                }
            }
            if(flag==0)
                System.out.println("There is no employee with EmpId : " +id);
        }
    }

// package JAVA_INTERNAL;
// import java.util.Scanner;
// public class EmployeeDetails {
//         public static void main(String[] args) {
//             // Employee data stored in arrays
//             int[] empIds = {101, 102, 103, 104, 105};
//             String[] empNames = {"John", "Alice", "Bob", "Emma", "David"};
//             String[] empDesignations = {"Manager", "Engineer", "Analyst", "Developer", "Tester"};
//             double[] empSalaries = {50000.0, 45000.0, 40000.0, 42000.0, 38000.0};
//             Scanner scanner = new Scanner(System.in);
//             System.out.print("Enter Employee ID: ");
//             int empId = scanner.nextInt();
//             scanner.close();

//             // Search for the employee in the array using the entered ID
//             int index = -1;
//             for (int i = 0; i < empIds.length; i++) {
//                 if (empIds[i] == empId) {
//                     index = i;
//                     break;
//                 }
//             }

//             // Display the details of the employee if found, otherwise show an error message
//             if (index != -1) {
//                 System.out.println("Employee ID: " + empIds[index]);
//                 System.out.println("Employee Name: " + empNames[index]);
//                 System.out.println("Employee Designation: " + empDesignations[index]);
//                 System.out.println("Employee Salary: $" + empSalaries[index]);
//             } else {
//                 System.out.println("Employee not found with ID: " + empId);
//             }
//         }
//     }
