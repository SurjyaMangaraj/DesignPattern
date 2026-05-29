public class EmployeeFactory {

    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("AndroidDeveloper")){
            return new AndroidDevloper();
        }
        else if (empType.trim().equalsIgnoreCase("WebDeveloper")){
            return new WebDevloper();
        }else{
            return null;
        }
    }
}
