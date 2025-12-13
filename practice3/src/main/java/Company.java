public class Company {
    static String companyName = "Apple";
    final int employeeID;
    String employeeName;

    Company(int newEmployeeID, String newEmployeeName){
        this.employeeID = newEmployeeID;
        this.employeeName = newEmployeeName;
    }

    static void printCompanyName(){
        System.out.println(companyName);
    }

    String getEmployeeName(){
        return this.employeeName;
    }

    void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
    }
}
