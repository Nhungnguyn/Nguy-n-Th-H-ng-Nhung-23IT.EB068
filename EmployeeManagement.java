import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    private List<Employee> employeeList;

    public EmployeeManagement() {
        employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void showAllEmployees() {
        for (Employee employee : employeeList) {
            employee.showInfo();
            System.out.println("-------------------------");
        }
    }
}
