package Lab_09_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Emloyee fte = new FTE();
        Emloyee contractor = new Contractor();
        List<Emloyee> employeeList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of FTE: ");
        int numberOfFTE = scanner.nextInt();
        System.out.print("Number of Contractor: ");
        int numberOfContractor = scanner.nextInt();

        for (int index = 0; index < numberOfFTE; index++) {
            employeeList.add(fte);
        }

        for (int index = 0; index < numberOfContractor; index++) {
            employeeList.add(contractor);
        }

        // Calling controller to process data
        int totalSalary = new EmployeeController().calculateTotalSalary(employeeList);
        System.out.println("Total salary:  " + totalSalary);
    }
}
