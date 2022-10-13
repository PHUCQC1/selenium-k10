package Lab_09_01;

import java.util.List;

public class EmployeeController {
    public int calculateTotalSalary(List<Emloyee> employeeList) {
        int salary = 0;
        for (Emloyee employee : employeeList) {
            salary = salary + employee.getSalary();
        }
        return salary;
    }
}
