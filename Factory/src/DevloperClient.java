public class DevloperClient {

    public static void main(String[] args) {
        Employee employee=EmployeeFactory.getEmployee("AndroidDeveloper");
        employee.salary();
    }

}
