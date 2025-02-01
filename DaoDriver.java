package jdbc;

import java.util.List;
import java.util.Scanner;

import com.tap.dao.EmployeeDAOImpl;
import com.tap.dto.Employee;

public class DaoDriver {

    public static void main(String[] args) {
        EmployeeDAOImpl empDAOImpl = new EmployeeDAOImpl();
        List<Employee> employees = empDAOImpl.getEmployess();
        for (Employee e : employees) {
            System.out.println(e);
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Employee ID to be updated: ");
        int id = scan.nextInt();

        Employee e = empDAOImpl.getEmployee(id);
        if (e != null) {
            System.out.println(e);
            System.out.println("Enter the salary to be updated: ");
            int newSalary = scan.nextInt();
            e.setSalary(newSalary);
            System.out.println(empDAOImpl.updateEmployee(e));
        } else {
            System.out.println("Employee not found!");
        }
    }
}
